package de.qa.javatest.sandbox;

import java.util.function.DoubleToIntFunction;

public class MyFirstProgram1 {

  public static void main(String[] args) {
    double length = 5;
    System.out.println("Плошадь со стороной "+length+" = " +area(length)+"!");
    double a = 6;
    double b = 6;
    System.out.println("Плошадь со стороной "+a+" и "+b+"=" +area(a,b)+"!");
  }

  public static double area(double length){
    return length*length;
  }

  public static double area(double a, double b){
    return a*b;
  }
}