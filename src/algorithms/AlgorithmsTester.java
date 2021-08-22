package algorithms;

import algorithms.sorting.BubbleSort;
import algorithms.sorting.InsertionSort;
import algorithms.sorting.SelectionSort;
import algorithms.sorting.SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmsTester {
  private static final int MAX_TRIES = 5; // the maximum allowed number of wrong inputs

  /**
   * Utility method to test Sorting algorithms
   *
   * @param arr
   * @param algorithm
   */
  public static void testSort(int[] arr, SortingAlgorithm algorithm) {
    System.out.println(Arrays.toString(algorithm.sort(arr)));
  }

  /** Utility method to test the N-sized matrices generation */
  public static void testMatrices() {
    int N = 4; // default
    int tries = 0;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter some integer less than 20");
      while (!scanner.hasNextInt() && tries < MAX_TRIES) {
        System.out.println("You should enter integer. Try again!");
        scanner.nextLine();
        tries++;
      }
      N = scanner.nextInt();
      while (N >= 20 && tries < MAX_TRIES) {
        System.out.println("Your input should be less than 20. Try again");
        while (!scanner.hasNextInt() && tries < MAX_TRIES) {
          System.out.println("You should enter integer. Try again!");
          scanner.nextLine();
          tries++;
        }
        N = scanner.nextInt();
        tries++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    new MatrixGenerator().generateMatrixN(N);
  }

  public static void main(String[] args) {
    // Sorting algos
    int[] arr1 = {7, 3, 1, 2, 4, 8, 6, 5};
    System.out.println("Sort array " + Arrays.toString(arr1));
    System.out.println("Bubble sort:");
    testSort(arr1, new BubbleSort());
    System.out.println("Selection sort:");
    testSort(arr1, new SelectionSort());
    System.out.println("Insertion sort:");
    testSort(arr1, new InsertionSort());

    // Test largest increasing sequence
    int[] arr2 = {3, 2, 3, 4, 2, 2, 4, 4};
    System.out.println("\nLargest increasing sequence in the array " + Arrays.toString(arr2) + ":");
    System.out.println(Arrays.toString(SubarrayUtils.findLargestIncreasingSequence(arr2)));

    // Test Largest Negative sequence
    int[] arr3 = {2, 3, -6, -1, -9, -1, 6, 4, -8, 8};
    System.out.println("\nLargest increasing sequence in the array " + Arrays.toString(arr3) + ":");
    System.out.println(Arrays.toString(SubarrayUtils.findLargestNegativeSequence(arr3)));

    // Test Mode
    System.out.println("\nMost duplicated number in the sequence" + Arrays.toString(arr2));
    System.out.println("Mode is " + SubarrayUtils.findMode(arr2));

    // Test factorial
    System.out.println("\nEquation n!*k!/(n-k)!");
    int n = 3, k = 6;
    System.out.println("Result for n=" + 3 + ", k=6:" + SubarrayUtils.solveFactorialEquation(n, k));

    // Test Matrix
    testMatrices();
  }
}
