package finalTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThirdFinalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        String[] lines = new String[n];


        sc = new Scanner(System.in);

        int index = 0;
        int uniqueCount = 0;
        char[] chars;
        Set uniqueChars;
        for (int i = 0; i < lines.length; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            lines[i] = sc.nextLine();

            if (i != 0) {
                chars = lines[i].toCharArray();
                uniqueChars = new HashSet<>();

                for (char c : chars) {
                    uniqueChars.add(c);
                }

                if (uniqueChars.size() > uniqueCount) {
                    uniqueCount = uniqueChars.size();
                    index = i;
                }
            } else {
                chars = lines[i].toCharArray();
                uniqueChars = new HashSet<>();

                for (char c : chars) {
                    uniqueChars.add(c);
                }

                uniqueCount = uniqueChars.size();
                index = i;
            }
        }
        System.out.println("Ответ: " + lines[index]);
        sc.close();
    }
}
