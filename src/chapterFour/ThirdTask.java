package chapterFour;

public class ThirdTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int c;
        c = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = c;

        System.out.println(arr[arr.length/2] + arr[0]);
    }
}
