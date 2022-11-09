package com.te.javabasics.abstraction;

public interface Car {
void accelerate();
void brake();
void gear();
default void airbags() {
}
default void gps() {
}
}
