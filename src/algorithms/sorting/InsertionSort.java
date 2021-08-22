package algorithms.sorting;

public class InsertionSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] arr){
        int curr_val, j;
        int[] sortedArray = arr.clone();
        for(int i=1; i<arr.length; i++){
            curr_val = sortedArray[i];
            j = i-1;
            for(; j>=0 && (curr_val<sortedArray[j]); j--){
                sortedArray[j+1]=sortedArray[j];
            }
            sortedArray[j+1] = curr_val;
        }
        return sortedArray;
    }
}
