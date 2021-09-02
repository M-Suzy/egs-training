package com.company.algorithms.homework_third;

import com.company.algorithms.homework_second.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm {

  @Override
  public void sort(int[] arr) {
    int stack[] = new int[arr.length];
    int top = 0, left = 0, right = arr.length - 1;
    int p;
    stack[top] = left;
    stack[++top] = right;
    while (top >= 0) {
      right = stack[top--];
      left = stack[top--];
      p = partition(arr, left, right);
      if (p-1  > left) {
        stack[++top] = left;
        stack[++top] = p - 1;
      }
      if (p  < right) {  // p+1 if using last element as pivot
        stack[++top] = p; // p+1 if using last element as pivot
        stack[++top] = right;
      }
    }
  }

  /**
   * Quick Sort partition with selection of the last element as pivot.
   *
   * @param arr
   * @param left
   * @param right
   * @return
   */
  private int partitionFromEndPoint(int[] arr, int left, int right) {
    int x = arr[right];
    int i = (left - 1);
    for (int j = left; j <= right - 1; j++){
      if (arr[j] <= x){
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, right);
    return (i + 1);
  }

  /**
   * Quick Sort partition with selection of the middle element as pivot.
   *
   * @param arr
   * @param left
   * @param right
   * @return
   */
  private int partition(int[] arr, int left, int right){
    int pivot = arr[(left+right)/2];
    int i = left;
    int j = right;
    while(i<=j){
      while(arr[i]<pivot) i++;
      while(arr[j]>pivot) j--;

      if(i<=j){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return i;
  }
}
