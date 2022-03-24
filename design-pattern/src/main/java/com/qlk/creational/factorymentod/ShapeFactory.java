package com.qlk.creational.factorymentod;

public class ShapeFactory {

  public static Shape getShape(Class<? extends Shape> clazz) {
    Shape shape = null;
    try {
      shape = (Shape) Class.forName(clazz.getName()).newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      throw new IllegalArgumentException("ShapeFactory[getShape], cast error --> \n --> " + e.getCause());
    }
    if (null == shape)
      throw new IllegalArgumentException("ShapeFactory[getShape], get null error");
    return shape;
  }
}
