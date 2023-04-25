package BinarySearch2dArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] n = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(array2d(n, 4)));
        System.out.println(Arrays.toString(rowcolmatrix(matrix, 49)));
    }

    static int[] array2d(int n[][], int target) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] rowcolmatrix(int[][] n, int target) {
        int row = 0;
        int col = n.length - 1;
        while (row < n.length && col >=0) {
            if (n[row][col] == target) {
                return new int[] { row, col };
            }
            if (n[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
