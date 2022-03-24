package com.qlk;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import javax.annotation.Nullable;

public class Foo {

  @Nullable
  String sortedBy;
  int notSortedBy;

  public int compareTo(Foo that) {
    return ComparisonChain.start()
            .compare(this.sortedBy, that.sortedBy, Ordering.natural().nullsFirst())
            .compare(this.notSortedBy, that.notSortedBy)
            .result();
  }

  public Foo(@Nullable String sortedBy, int notSortedBy) {
    this.sortedBy = sortedBy;
    this.notSortedBy = notSortedBy;
  }

  @Override
  public String toString() {
    return "Foo{" +
            "sortedBy='" + sortedBy + '\'' +
            ", notSortedBy=" + notSortedBy +
            '}';
  }

  @Nullable
  public String getSortedBy() {
    return sortedBy;
  }

  public void setSortedBy(@Nullable String sortedBy) {
    this.sortedBy = sortedBy;
  }

  public int getNotSortedBy() {
    return notSortedBy;
  }

  public void setNotSortedBy(int notSortedBy) {
    this.notSortedBy = notSortedBy;
  }
}