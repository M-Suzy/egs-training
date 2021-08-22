package algorithms;

import java.util.Arrays;

public class SubarrayUtils {
  /**
   * Finds the longest sorted subarray
   *
   * @param arr
   * @return arr in range [start...end]
   */
  public static int[] findLargestIncreasingSequence(int arr[]) {
    int counter = 1;
    int max_length = 1;
    int i = 0, end = 0;
    while (i < arr.length - 1) {
      if (arr[i] <= arr[i + 1]) {
        ++counter;
        if (max_length < counter) {
          max_length = counter;
          end = i + 1;
        }
      } else {
        counter = 1;
      }
      i++;
    }
    return Arrays.copyOfRange(arr, end - max_length + 1, end + 1);
  }

  /**
   * Method is for finding the most duplicated number in the sequence (the mode)
   *
   * @param arr
   * @return
   */
  public static int findMode(int[] arr) {
    int counter = 1;
    int max_length = 1;
    int i = 0;
    int key = arr[0];
    while (i < arr.length - 1) {
      if (arr[i] == arr[i + 1]) {
        ++counter;
        if (max_length < counter) {
          max_length = counter;
          key = arr[i];
        }
      } else {
        counter = 1;
      }
      i++;
    }
    return key;
  }

  /**
   * Counts factorial of the number
   *
   * @param n
   * @return factorial
   */
  public static int getFactorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * getFactorial(n - 1);
  }

  /**
   * Solves the equation n!*k!/(n-k)!
   *
   * @param n
   * @param k
   * @return
   */
  public static int solveFactorialEquation(int n, int k) {
    if (n < k && n > 1) {
      return getFactorial(n) * getFactorial(k) / getFactorial(k - n);
    } else {
      System.out.println("Wrong parameters");
      return -1;
    }
  }

  /**
   * Find Largest Negative sequence
   *
   * @param arr
   * @return
   */
  public static int[] findLargestNegativeSequence(int[] arr) {
    int counter = 1;
    int max_length = 1;
    int i = 0, end = 0;
    while (i < arr.length) {
      if (arr[i] < 0) {
        ++counter;
        if (max_length < counter) {
          max_length = counter;
          end = i + 1;
        }
      } else {
        counter = 1;
      }
      i++;
    }
    return Arrays.copyOfRange(arr, end - max_length + 1, end);
  }
}
