package chapterEight;

public class FourteenthTask {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() + 0.01) * 40) - 20;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int val: arr) {
            if (val > max) {
                max = val;
            } else if (val < min) {
                min = val;
            }
        }

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Наибольшее число по модулю: " + Math.max(max, Math.abs(min)));
    }
}
