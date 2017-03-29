package InitDnepr.home_work;

import java.util.Random;

/**
 * Created by d1mys1klapo4ka on 27.03.2017.
 */
public class MatrixMult {

    public static void main(String[] args) {

        int[][] firstMatrix = getMatrix(2,3);
        int[][] secondMatrix = getMatrix(3,2);
        printMatrix(firstMatrix);
        printMatrix(secondMatrix);
        printMatrix(matrixMultiplication(firstMatrix, secondMatrix));
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0, n = matrix.length; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] getMatrix(int a, int b){
        Random random = new Random();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
        return matrix;
    }

    public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix){
        int[][] newMatrix = new int[firstMatrix.length][secondMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < secondMatrix.length; k++) {
                    newMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return newMatrix;
    }
}
