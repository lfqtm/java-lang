package com.qlk.creational.abstractfactorypattern.shape;

import com.qlk.creational.abstractfactorypattern.Shape;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
