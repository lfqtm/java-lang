package com.qlk;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.*;

class OrderingTest {

  @Test
  void creation() {
    Ordering<String> byLengthOrdering = new Ordering<String>() {
      public int compare(String left, String right) {
        return Ints.compare(left.length(), right.length());
      }
    };

    int compare = byLengthOrdering.compare("3", "222");
    System.out.println("compare = " + compare);

  }

  @Test
  void chaining() {
    Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
      public String apply(Foo foo) {
        return foo.sortedBy;
      }
    });

    List<Foo> foos = Lists.newArrayList();
    foos.add(new Foo("ab", 1));
    foos.add(new Foo("bab", 1));
    foos.add(new Foo("a", 1));
    foos.add(new Foo("cab", 1));
    foos.add(new Foo("abb", 1));
    foos.add(new Foo("caa", 1));
    foos.add(new Foo("bba", 1));
    Foo min = ordering.min(foos);
    System.out.println("min = " + min);

    List<Foo> foos1 = ordering.greatestOf(foos, 3);
    System.out.println("foos1 = " + foos1);

    List<Foo> foos2 = ordering.sortedCopy(foos);
    System.out.println("foos2 = " + foos2);

  }
}
