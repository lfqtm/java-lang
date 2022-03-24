package com.qlk;

import com.google.common.base.Throwables;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

class ObjectsUtilTest {
  @Test
  void compare() {
    Foo ab1 = new Foo("ab", 1);
    Foo ab2 = new Foo("ab", 2);
    Foo cd = new Foo("cd", 1);
    Foo nulFoo = new Foo(null, 3);

    System.out.println(ab1.compareTo(cd));
    System.out.println(ab1.compareTo(ab2));
    System.out.println(ab2.compareTo(nulFoo));

  }

  @Test
  void throwable() throws RuntimeException {

    try {
      System.out.println(1 / 0);
    } catch (Exception e) {
//      Throwables.throwIfInstanceOf(e, ArithmeticException.class);
      String stackTraceAsString = Throwables.getStackTraceAsString(e);
      System.out.println("stackTraceAsString = " + stackTraceAsString);
    }

  }

  @Test
  void immutable() {
    ImmutableSet<String> WEBSAFE_COLORS = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");
    System.out.println("WEBSAFE_COLORS = " + WEBSAFE_COLORS);

    ImmutableSet<String> gray = ImmutableSet.<String>builder()
            .addAll(WEBSAFE_COLORS)
            .add("gray")
            .build();
    System.out.println("gray = " + gray);
  }

}
