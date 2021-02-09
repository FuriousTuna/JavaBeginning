package chapterSix;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0, i = 0;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм");
                i = sc.nextInt();
                System.out.println("Введите число");
                val = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Результаты:");
                        System.out.println("Граммы: " + val * 1.0);
                        System.out.println("Килограммы: " + val / 1000.0);
                        break;
                    case 2:
                        System.out.println("Результаты:");
                        System.out.println("Граммы: " + val * 1000.0);
                        System.out.println("Килограммы: " + val * 1.0);
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                i = sc.nextInt();
                System.out.println("Введите число");
                val = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Результаты:");
                        System.out.println("Метры: " + val * 1.0);
                        System.out.println("Мили: " + val * 0.00062137);
                        System.out.println("Ярды: " + val * 1.0936);
                        System.out.println("Футы: " + val * 3.28084);
                        break;
                    case 2:
                        System.out.println("Результаты:");
                        System.out.println("Метры: " + val * 1609.344);
                        System.out.println("Мили: " + val * 1.0);
                        System.out.println("Ярды: " + val * 1760.0);
                        System.out.println("Футы: " + val * 5280.0);
                        break;
                    case 3:
                        System.out.println("Результаты:");
                        System.out.println("Метры: " + val * 0.9144);
                        System.out.println("Мили: " + val * 0.00056818);
                        System.out.println("Ярды: " + val * 1.0);
                        System.out.println("Футы: " + val * 3.0000);
                        break;
                    case 4:
                        System.out.println("Результаты:");
                        System.out.println("Метры: " + val * 0.3048);
                        System.out.println("Мили: " + val * 0.00018939);
                        System.out.println("Ярды: " + val * 0.33333);
                        System.out.println("Футы: " + val * 1.0);
                        break;
                }
                break;
        }
        sc.close();
    }
}
