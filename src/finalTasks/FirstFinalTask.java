package finalTasks;

import java.util.Scanner;

public class FirstFinalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        double dollar = sc.nextDouble();
        System.out.print("Введите количетсво рублей: ");
        int count = sc.nextInt();

        sc.close();

        System.out.printf("Итого: %.2f долларов", (count / dollar));
    }
}
