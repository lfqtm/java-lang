package com.qlk.creational.abstractfactorypattern.shape;

import com.qlk.creational.abstractfactorypattern.Shape;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
