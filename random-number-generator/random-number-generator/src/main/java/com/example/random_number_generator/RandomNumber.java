package com.example.random_number_generator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class RandomNumber {

  @NotNull
  @Min(value = 0)
  private Integer min;

  @NotNull
  @Min(value = 0)
  private Integer max;

  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  @Override
  public String toString() {
    return "Min " + this.min + "Max " + this.max;  
  }
}
