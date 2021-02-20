package chapterSeven;

import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int n = sc.nextInt();
        int sum = 0;

        sc.close();

        for (int i = 1; i < n; i+=2) {
            sum += i;
        }

        System.out.println(sum);
    }
}
