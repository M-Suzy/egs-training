package com.company.homework_1;

/** Utility class for Number conversions. */
public class NumberConverter {
  private static final char hexSymbols[] = {
    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
  };

  /**
   * Converts decimal integer number to binary.
   *
   * @param decimal
   * @return binary
   */
  public static byte[] toBinary(int decimal) {
    int size = (int) (Math.log(decimal) / Math.log(2));
    byte[] binary = new byte[size + 1];
    for (int i = size; i >= 0; i--) {
      binary[i] = (byte) (decimal & 1);
      decimal >>= 1;
    }
    return binary;
  }

  /**
   * Converts decimal integer to its hexadecimal form.
   *
   * @param decimal
   * @return hex
   */
  public static String toHexadecimal(int decimal) {
    String hex = "";
    for (int i = 0; i < decimal; i++) {
      hex = hexSymbols[decimal % 16] + hex;
      decimal /= 16;
    }
    return hex;
  }
}
