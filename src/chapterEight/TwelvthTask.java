package chapterEight;

import java.util.Scanner;

public class TwelvthTask {
    public static void main(String[] args) {
        // Принимать на вход строку и принимать конкретную на вход строку кажется не одно и тоже, поэтому реализую оба варианта,
        // где уже имеется строка, и где со сканера вводится строка

        // #1
        // String str = sc.nextLine();

        // #2
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.replaceAll("a", "o").substring(7, 11));
        }
    }
}
