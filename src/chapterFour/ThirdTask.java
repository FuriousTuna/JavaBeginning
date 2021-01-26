package chapterFour;

public class ThirdTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int c = 0;
        c = arr[0];
        arr[0] = arr[arr.length-1];
        arr[4] = c;

        System.out.println(arr[arr.length-3] + arr[arr.length-1]);
    }
}
