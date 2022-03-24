package com.qlk.creational.abstractfactorypattern;

import com.qlk.creational.abstractfactorypattern.color.Green;
import com.qlk.creational.abstractfactorypattern.color.Red;
import com.qlk.creational.abstractfactorypattern.shape.Circle;

public class Test {
  public static void main(String[] args) {

    ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory(ShapeFactory.class);
    ColorFactory colorFactory = (ColorFactory) FactoryProducer.getFactory(ColorFactory.class);

    Shape shape = shapeFactory.getShape(Circle.class);
    shape.draw();
    Color color = colorFactory.getColor(Red.class);
    color.fill();

  }
}
