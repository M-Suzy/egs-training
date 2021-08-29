package algorithms.homework_one;

public class SelectionSort implements SortingAlgorithm{
  @Override
  public void sort(int[] arr) {
    int min;
    if(arr.length<=1){
      return;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(arr, min, i);
    }
  }
}
