package com.qlk.creational.abstractfactorypattern.color;

import com.qlk.creational.abstractfactorypattern.Color;

public class Green implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Green::fill() method.");
  }
}
