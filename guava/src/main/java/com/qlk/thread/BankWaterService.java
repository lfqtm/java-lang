package com.qlk.thread;

import java.util.Map;
import java.util.concurrent.*;

/**
 * 合并计算
 */
public class BankWaterService implements Runnable {
  private CyclicBarrier c = new CyclicBarrier(4, this);
  private Executor executor = Executors.newFixedThreadPool(4);
  private ConcurrentHashMap<String, Integer> sheetBankWaterCount
      = new ConcurrentHashMap<>();

  private void count() {
    for (int i = 0; i < 4; i++) {
      executor.execute(() -> {
        sheetBankWaterCount.put(Thread.currentThread().getName(), 1);

        try {
          c.await();
        } catch (InterruptedException | BrokenBarrierException e) {
          e.printStackTrace();
        }
      });
    }
  }

  @Override
  public void run() {
    int result = 0;
    for (Map.Entry<String, Integer> sheet : sheetBankWaterCount.entrySet()) {
      result += sheet.getValue();
    }
    sheetBankWaterCount.put("result", result);
    System.out.println(result);
  }

  public static void main(String[] args) {
    BankWaterService bankWaterService = new BankWaterService();
    bankWaterService.count();
  }
}
