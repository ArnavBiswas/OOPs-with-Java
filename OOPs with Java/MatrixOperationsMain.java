// Java program to perform addition, subtraction, and multiplication of two 2D matrices
import java.util.Arrays;

class MatrixOperations {
    public int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}

public class MatrixOperationsMain {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Matrix 1: " + Arrays.deepToString(matrix1));
        System.out.println("Matrix 2: " + Arrays.deepToString(matrix2));
        System.out.println("Addition: " + Arrays.deepToString(matrixOps.addMatrices(matrix1, matrix2)));
        System.out.println("Subtraction: " + Arrays.deepToString(matrixOps.subtractMatrices(matrix1, matrix2)));
        System.out.println("Multiplication: " + Arrays.deepToString(matrixOps.multiplyMatrices(matrix1, matrix2)));
    }
}
