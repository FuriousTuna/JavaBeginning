package chapterSix;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = sc.nextDouble();
        System.out.println("Введите второе число:");
        double b = sc.nextDouble();
        System.out.println("Введите знак операции (+, -, *, /):");
        String symbol = sc.next();

        switch (symbol) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Делить на ноль нельзя!!!");
                } else {
                    System.out.println(a / b);
                }
                break;
        }
    }
}
