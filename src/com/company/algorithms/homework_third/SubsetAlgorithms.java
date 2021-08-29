package com.company.algorithms.homework_third;

import java.util.Arrays;

public class SubsetAlgorithms {
  /**
   * Function in general check whether there is a subset summing to the given number. This algorithm
   * uses a popular dynamic programming approach.
   *
   * @param arr
   * @param sum
   * @return
   */
  public boolean hasSubsetSum(int[] arr, int sum) {
    boolean[][] dpMatrix = new boolean[arr.length][sum + 1];
    for (int i = 0; i < arr.length; i++) {
      dpMatrix[i][0] = true;
    }
    for (int j = 0; j <= sum; j++) {
      if (j == arr[0]) {
        dpMatrix[0][j] = true;
      }
    }
    for (int i = 1; i < arr.length; i++) {
      for (int j = 1; j <= sum; j++) {
        if (dpMatrix[i - 1][j]) {
          dpMatrix[i][j] = true;
        } else if (j >= arr[i]) {
          dpMatrix[i][j] = dpMatrix[i - 1][j - arr[i]];
        }
      }
    }
    return dpMatrix[arr.length - 1][sum];
  }

  /**
   * Finds integer missing in any given range.
   *
   * @param arr
   * @param from
   * @param to
   * @return
   */
  public int getMissingValue(int[] arr, int from, int to) {
    // formula to get the sum of consecutive integers in range [from, to].
    int total_sum = (to - from + 1) * (from + to) / 2;
    for (int i : arr) {
      total_sum -= i;
    }
    return total_sum;
  }

  /**
   * Deletes duplicate values in the given array.
   *
   * @param arr
   */
  public int[] deleteDuplicates(int[] arr) {
   new QuickSort().sort(arr);
   int count = 0;
   for(int i = 0; i<arr.length; i++){
     if(i==0 || arr[i]!=arr[i-1]){
       arr[count++] = arr[i];
     }
   }
   return Arrays.copyOf(arr, count);
  }
}
