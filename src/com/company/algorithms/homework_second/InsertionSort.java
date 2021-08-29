package com.company.algorithms.homework_second;

public class InsertionSort implements SortingAlgorithm {
  @Override
  public void sort(int[] arr) {
    int curr_val, j;
    if(arr.length<=1){
      return;
    }
    for (int i = 1; i < arr.length; i++) {
      curr_val = arr[i];
      j = i - 1;
      for (; j >= 0 && (curr_val < arr[j]); j--) {
        arr[j + 1] = arr[j];
      }
      arr[j + 1] = curr_val;
    }
  }
}
