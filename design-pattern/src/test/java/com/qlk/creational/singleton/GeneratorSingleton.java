package com.qlk.creational.singleton;

public class GeneratorSingleton {
  enum SerialGenerator {
    INSTANCE;
    private long code;
    public synchronized long next() {
      System.out.println(Thread.currentThread().getName() + "=> code: " + code + "+1");
      return ++code;
    }
  }

  public static void main(String[] args) {
    SerialGenerator instance = SerialGenerator.INSTANCE;
    long code = instance.code;
    long next = instance.next();
    System.out.println(code + " => " + next);

    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        try {
          Thread.sleep(100);

          if (instance.next() == 100) {
            System.out.println("counter = 100");
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }).start();
    }
  }
}
