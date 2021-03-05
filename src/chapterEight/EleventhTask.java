package chapterEight;

import java.util.Scanner;

public class EleventhTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String val1 = sc.next();

        System.out.print("Введите второе число: ");
        int val2 = sc.nextInt();

        System.out.print("Большее число: ");

        System.out.println(Math.max(Double.parseDouble(val1), val2)); // так как не указано, в каком формате выводить первое число, вывожу double
        System.out.print("Меньшее число: ");
        System.out.println(Math.min(Double.parseDouble(val1), val2));

    }
}
