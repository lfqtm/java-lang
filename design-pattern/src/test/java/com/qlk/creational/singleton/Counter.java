package com.qlk.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {
  private static final AtomicLong counter = new AtomicLong(0);

  public static long addOne() {
    return counter.incrementAndGet();
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        try {
          Thread.sleep(100);
          if (Counter.addOne() == 100) {
            System.out.println("counter = 100");
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }).start();
    }
  }
}

