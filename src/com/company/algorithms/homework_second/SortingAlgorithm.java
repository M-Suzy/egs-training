package com.company.algorithms.homework_second;

public interface SortingAlgorithm {
    void sort(int[] arr);
    default void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
