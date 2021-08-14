package com.company.homework_1;

import java.util.Arrays;

/** Utility class for printing converted numbers. */
public class ConvertedNumberPrinter {
  /**
   * Prints the binary form representation of decimal integer as in memory register.
   *
   * @param decimal
   */
  public static void printBinary(int decimal) {
    byte[] binary = NumberConverter.toBinary(10);
    String bin = Arrays.toString(binary);
    System.out.println(
        "Binary representation of integer number "
            + decimal
            + ": "
            + bin.substring(1, bin.length() - 1).replace(",", ""));
  }

  /**
   * Prints hexadecimal form of decimal integer.
   *
   * @param decimal
   */
  public static void printHexadecimal(int decimal) {
    System.out.println(
        "Hexadecimal representation of number "
            + decimal
            + ": "
            + NumberConverter.toHexadecimal(decimal));
  }
}
