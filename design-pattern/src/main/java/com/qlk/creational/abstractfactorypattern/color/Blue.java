package com.qlk.creational.abstractfactorypattern.color;

import com.qlk.creational.abstractfactorypattern.Color;

public class Blue implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Blue::fill() method.");
  }
}
