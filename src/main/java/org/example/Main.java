package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int rows = 2;
        int cols = 3;
        int[][] matrixA = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = random.nextInt(51);
            }
        }

        System.out.println("Матриця А:");
        printMatrix(matrixA);

        System.out.println("\nСуми елементів матриці за рядками:");
        double totalSum = 0;
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrixA[i][j];
            }
            totalSum += rowSum;
            System.out.println("Рядок " + (i + 1) + ": " + rowSum);
        }

        double average = totalSum / (rows * cols);
        System.out.printf("\nСереднє арифметичне: %.2f\n", average);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }
}