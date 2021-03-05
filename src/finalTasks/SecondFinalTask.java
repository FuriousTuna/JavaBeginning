package finalTasks;

import java.util.Scanner;

public class SecondFinalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите уравнение формата \"a(+|-)b=c\", где a, b и c - числа от 0 до 9, одно из которых неизвестное (равно x)");
        System.out.print("Ввод: ");
        String str = sc.nextLine();
        if (str.length() > 5) {
            System.out.println("Неправильный формат уравнения");
            return;
        }
        char a = str.toCharArray()[0];
        char op = str.toCharArray()[1];
        char b = str.toCharArray()[2];
        char c = str.toCharArray()[4];

        int x = 0;

        if (a == 'x') {
            switch (op) {
                case '+':
                    x = Character.getNumericValue(c) - Character.getNumericValue(b);
                    break;
                case '-':
                    x = Character.getNumericValue(c) + Character.getNumericValue(b);
                    break;
                default:
                    System.out.println("Неверно указан оператор (только + или -)!");
            }
        }
        else if (b == 'x') {
            switch (op) {
                case '+':
                    x = Character.getNumericValue(c) - Character.getNumericValue(a);
                    break;
                case '-':
                    x = - Character.getNumericValue(c) + Character.getNumericValue(a);
                    break;
                default:
                    System.out.println("Неверно указан оператор (только + или -)!");
            }
        }
        else if (c == 'x') {
            switch (op) {
                case '+':
                    x = Character.getNumericValue(a) + Character.getNumericValue(b);
                    break;
                case '-':
                    x = Character.getNumericValue(a) - Character.getNumericValue(b);
                    break;
                default:
                    System.out.println("Неверно указан оператор (только + или -)!");
            }
        }

        System.out.println("Вывод: " + x);

    }
}
