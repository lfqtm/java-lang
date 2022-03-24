package com.qlk.creational.abstractfactorypattern;

public class FactoryProducer {
  public static AbstractFactory getFactory(Class<? extends AbstractFactory> factoryClazz){
    AbstractFactory abstractFactory = null;
    try {
      abstractFactory = (AbstractFactory) Class.forName(factoryClazz.getName()).newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      throw new IllegalArgumentException("FactoryProducer[getFactory], cast error --> \n --> " + e.getCause());
    }
    if (null == abstractFactory)
      throw new IllegalArgumentException("FactoryProducer[getFactory], get null error");
    return abstractFactory;
  }
}
