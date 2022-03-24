package com.qlk;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class DemoTest {

  @Test
  void multiMapConstruction() {
    ListMultimap<String, Integer> build = MultimapBuilder.treeKeys().arrayListValues().build();
  }

  @Test
  void join() {
    Joiner joiner = Joiner.on(";").skipNulls();
    System.out.println(joiner.join("Harry", null, "Ron", "Hermione"));
  }

  @Test
  void splitter() {
    Iterable<String> split = Splitter.on(",").trimResults().omitEmptyStrings().split("foo,bar,,   qux");
    System.out.println("split = " + split);

    String toSplit = " x -> y, z-> a ";
    Splitter outerSplitter = Splitter.on(',').trimResults();
    Splitter.MapSplitter mapSplitter = outerSplitter.withKeyValueSeparator(Splitter.on("->"));
    Map<String, String> result = mapSplitter.split(toSplit);
    assertEquals(result, ImmutableMap.of("x ", " y", "z", " a"));
  }
}
