package com.qlk.creational.abstractfactorypattern.shape;

import com.qlk.creational.abstractfactorypattern.Shape;

public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
