package algorithms.homework_two;

import algorithms.homework_one.SortingAlgorithm;

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
      if (p + 1 < right) {
        stack[++top] = p + 1;
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
  private int partition(int[] arr, int left, int right) {
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
}
