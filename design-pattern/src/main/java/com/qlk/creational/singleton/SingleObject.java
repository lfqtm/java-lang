package com.qlk.creational.singleton;

public class SingleObject {

  //创建一个对象
  private static SingleObject instance = new SingleObject();
  //构造器私有
  private SingleObject() {}
  //获取唯一可用对象
  public static SingleObject getInstance() {
    return instance;
  }
}
