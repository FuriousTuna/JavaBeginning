package chapterSeven;

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        double[] arr = new double[sc.nextInt()];
        double sum = 0.0,
               avg = 0.0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        sc.close();

        avg = sum / arr.length;

        for (double d: arr) {
            System.out.println(d + " * " + avg + " = " +(d * avg));
        }
    }
}
