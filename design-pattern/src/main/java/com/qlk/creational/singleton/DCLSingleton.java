package com.qlk.creational.singleton;

import java.io.Serializable;

//DoubleCheckedLocking：dcl双检锁
public class DCLSingleton implements Serializable {

  private volatile static DCLSingleton dclSingleton;
  private DCLSingleton() {}

  public static DCLSingleton getSingleton() {
    if (dclSingleton == null) {
      synchronized (DCLSingleton.class) {
        if (dclSingleton == null) {
          dclSingleton = new DCLSingleton();
        }
      }
    }
    return dclSingleton;
  }

}
