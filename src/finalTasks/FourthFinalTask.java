package finalTasks;

import java.util.Scanner;

public class FourthFinalTask {
    public static void main(String[] args) {

        String rightAnswer = "Заархивированный вирус";

        int tries = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        while (tries > 0) {
            System.out.print("Ответ: ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("подсказка")) {
                if (tries == 3) {
                    tries -= 2;
                    System.out.println("Ну это точно не лук");
                    System.out.print("Ответ: ");
                    answer = sc.nextLine();
                }
                else {
                    System.out.println("Подсказка уже недоступна");
                    System.out.print("Ответ: ");
                    answer = sc.nextLine();
                }
            }
            if (rightAnswer.equals(answer)) {
                System.out.println("Правильно!");
                return;
            }
            else {
                tries--;
                if (tries > 0) {
                    System.out.println("Подумай еще!");
                }
            }

        }
        System.out.println("Обидно, приходи в другой раз");



    }
}
