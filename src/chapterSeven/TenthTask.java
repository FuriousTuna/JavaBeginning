package chapterSeven;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите размерность матрицы (2 положительных целых числа через пробел): ");
        int[][] matrix = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Укажите значение элемента [" + (i + 1) + "][" + (j + 1) + "]");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Первая строка матрицы:");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(3 * matrix[0][i] + " ");
        }
            System.out.println();
    }
}
