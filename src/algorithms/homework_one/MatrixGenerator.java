package algorithms.homework_one;

/** Class for Matrix generation with different properties */
public class MatrixGenerator {
  /**
   * Method generates NxN matrix in which each cell keeps its corresponding index of 1D array
   *
   * @param N
   * @return
   */
  public int[][] generateMatrixN(int N) {
    int[][] matrix = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        matrix[i][j] = i * N + j + 1;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    return matrix;
  }
}
