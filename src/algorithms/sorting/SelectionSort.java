package algorithms.sorting;

public class SelectionSort implements SortingAlgorithm{
  @Override
  public int[] sort(int[] arr) {
    int min;
    int temp;
    int [] sortedArray = arr.clone();
    for (int i = 0; i < arr.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (sortedArray[j] < sortedArray[min]) {
          min = j;
        }
      }
      temp = sortedArray[min];
      sortedArray[min] = sortedArray[i];
      sortedArray[i] = temp;
    }
    return sortedArray;
  }
}
