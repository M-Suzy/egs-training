package algorithms.sorting;

public class BubbleSort  implements SortingAlgorithm{
  /**
   *
   * Bubble sorting for integer arrays with optimized swapping
   * @param arr
   * @return sortedArray
   */
  public int[] sort(int[] arr) {
    if(arr==null || arr.length==0){
      System.out.println("Array is empty.");
      return null;
    }
    int[] sortedArray = arr.clone();
    int temp;
    boolean isSwapped;
    for (int i = 0; i < arr.length-1; i++) {
      isSwapped = false;
      for (int j = 0; j < arr.length - i-1; j++) {
        if (sortedArray[j] > sortedArray[j + 1]) {
          temp = sortedArray[j];
          sortedArray[j] = sortedArray[j+1];
          sortedArray[j+1] = temp;
          isSwapped = true;
        }
      }
      if(!isSwapped){
        break;
      }
    }

    return sortedArray;
  }
}
