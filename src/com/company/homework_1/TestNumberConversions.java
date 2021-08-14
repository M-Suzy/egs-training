package com.company.homework_1;

public class TestNumberConversions {
  public static void main(String[] args) {
    // test binary
    System.out.println("Conversion with custom decimal to binary converter............");
    ConvertedNumberPrinter.printBinary(10);
    System.out.println("Conversion with built in method : " + Integer.toString(10, 2));
    // test hexadecimal
    System.out.println("Conversion with custom decimal to hexadecimal converter............");
    ConvertedNumberPrinter.printHexadecimal(10);
    System.out.println("Conversion with built in method : " + Integer.toString(10, 16));
  }
}
