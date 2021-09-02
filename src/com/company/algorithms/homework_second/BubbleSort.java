package com.company.algorithms.homework_second;

public class BubbleSort  implements SortingAlgorithm{
  /**
   *
   * Bubble sorting for integer arrays with optimized swapping
   * @param arr
   */
  public void sort(int[] arr) {
    if(arr.length<=1){
      return;
    }
    boolean isSwapped;
    for (int i = 0; i < arr.length-1; i++) {
      isSwapped = false;
      for (int j = 0; j < arr.length - i-1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j+1);
          isSwapped = true;
        }
      }
      if(!isSwapped){
        break;
      }
    }
  }
}
