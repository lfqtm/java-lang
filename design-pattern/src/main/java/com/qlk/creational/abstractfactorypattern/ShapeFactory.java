package com.qlk.creational.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {

  @Override
  public Color getColor(Class<? extends Color> clazz) {
    Color color = null;
    try {
      color = (Color) Class.forName(clazz.getName()).newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      throw new IllegalArgumentException("ShapeFactory[getColor], cast error --> \n --> " + e.getCause());
    }
    if (null == color)
      throw new IllegalArgumentException("ShapeFactory[getColor], get null error");
    return color;
  }

  @Override
  public Shape getShape(Class<? extends Shape> clazz) {
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
