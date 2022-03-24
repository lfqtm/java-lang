package com.qlk.creational.singleton;

import java.io.Serializable;

/**
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 */
public class StaticInnerSingleton {
  private static class SingletonHolder {
    private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
  }

  private StaticInnerSingleton() {}
  public static final StaticInnerSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
