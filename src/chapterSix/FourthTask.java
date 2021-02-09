package chapterSix;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double average = (x + y + z)/3;

        System.out.println("Среднее арифметическое = " + average);

        average = Math.floor((average)/2);

        if (average > 3.0) {
            System.out.println("Программа выполнена корректно");
        }

        sc.close();
    }

}
