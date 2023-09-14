package com.example.assignment;

import jakarta.persistence.*;

@Entity
public class Benchmark {
  @Id
  private Long id;
  private String uniqueCode;

  protected Benchmark() {}

  public Benchmark(String s) {
    this.uniqueCode = s;
  }

  public Benchmark(long l, String s) {
    this.uniqueCode = s;
    this.id = l;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUniqueCode() {
    return uniqueCode;
  }

  public void setUniqueCode(String uniqueCode) {
    this.uniqueCode = uniqueCode;
  }

  @Override
  public String toString() {
    return "Benchmark{" +
            "id=" + id +
            ", uniqueCode='" + uniqueCode + '\'' +
            '}';
  }
}