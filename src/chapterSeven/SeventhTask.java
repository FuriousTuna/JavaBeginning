package chapterSeven;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        final int x = 5,
                  y = 10,
                  z = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i] = sc.nextInt();

            if ((arr[i] == x) || (arr[i] == y) || (arr[i] == z))
                System.out.println("Данное значение имеется в константах");
        }
        sc.close();

    }
}
