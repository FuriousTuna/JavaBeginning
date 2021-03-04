package chapterEight;

import java.util.Scanner;

public class ThirteenthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из слов (латиница/кириллица), разделенные пробелами:");
        String str = sc.nextLine();

        String[] arr = str.split("\\s+");
        int count = 0;

        for (String word: arr) {
            if (word.matches("[a-zA-z]*")) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов из латинских букв: " + count);
    }
}
