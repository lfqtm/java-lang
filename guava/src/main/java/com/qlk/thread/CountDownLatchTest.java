package com.qlk.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
  static CountDownLatch countDownLatch = new CountDownLatch(2);

  public static void main(String[] args) throws InterruptedException {
    new Thread(() -> {
      System.out.println("parse 1");
      countDownLatch.countDown();
    }).start();

    new Thread(() -> {
      System.out.println("parse 2");
      countDownLatch.countDown();
    }).start();

    countDownLatch.await();
    System.out.println("all finish");

  }
}
