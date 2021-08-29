package com.company.algorithms.homework_third;

import com.company.algorithms.homework_second.SortingAlgorithm;

public class MergeSort implements SortingAlgorithm {
  /**
   * Executes the merging process for Descending MergeSort algorithm
   * @param arr
   * @param sorted
   * @param leftFirst
   * @param rightFirst
   * @param leftSecond
   * @param rightSecond
   */
  private static void mergeDescending(int[] arr, int[] sorted, int leftFirst, int rightFirst, int leftSecond, int rightSecond) {
    int i = 0;
    while(leftFirst<=rightFirst && leftSecond<=rightSecond){
      if(arr[leftFirst]>=arr[leftSecond]){
        sorted[i++]=arr[leftFirst];
        leftFirst++;
      }
      else {
        sorted[i++]=arr[leftSecond];
        leftSecond++;
      }
    }
    while(leftFirst<=rightFirst){
      sorted[i++]=arr[leftFirst];
      leftFirst++;
    }
    while(leftSecond<=rightSecond){
      sorted[i++]=arr[leftSecond];
      leftSecond++;
    }
  }

  /**
   * Sorting algorithm to divide & merge array iteratively.
   * @param arr
   */
  @Override
  public void sort(int[] arr) {
    if (arr.length <= 1) {
      return;
    }
    int[] temp = new int[arr.length];
    int len = 1, i, leftFirstHalf, rightFirstHalf, leftSecondHalf, rightSecondHalf;
    while(len<arr.length){
      i = 0;
      while(i<arr.length){
        leftFirstHalf = i;
        rightFirstHalf = i+len-1;
        leftSecondHalf = i+len;
        rightSecondHalf = i+2*len-1;
        if(leftSecondHalf>=arr.length) break;
        if(rightSecondHalf>=arr.length) {
          rightSecondHalf = arr.length-1;
        }
        mergeDescending(arr, temp, leftFirstHalf, rightFirstHalf, leftSecondHalf, rightSecondHalf);
        for(int j = 0; j<rightSecondHalf-leftFirstHalf+1; j++){
          arr[i+j]=temp[j];
        }
        i+=2*len;
      }
      len *= 2;
    }
  }
}
