package com.qlk.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

  @Test
  void create() {
    EnumSingleton ins1 = EnumSingleton.INSTANCE;
    EnumSingleton ins2 = EnumSingleton.INSTANCE;

    ins2.whateverMethod();

    assertEquals(ins1, ins2);
  }
}