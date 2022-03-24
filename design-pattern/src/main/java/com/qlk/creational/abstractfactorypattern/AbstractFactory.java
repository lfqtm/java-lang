package com.qlk.creational.abstractfactorypattern;

public abstract class AbstractFactory {
  public abstract Color getColor(Class<? extends Color> clazz);

  public abstract Shape getShape(Class<? extends Shape> clazz);
}
