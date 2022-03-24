package com.qlk.creational.factorymentod;

public class Test {
  public static void main(String[] args) {
//    Shape shape01 = ShapeFactory.getShape(Shape.class);
//    shape01.draw();

    Shape shape02 = ShapeFactory.getShape(Circle.class);
    shape02.draw();

    Shape shape03 = ShapeFactory.getShape(Rectangle.class);
    shape03.draw();
  }
}
