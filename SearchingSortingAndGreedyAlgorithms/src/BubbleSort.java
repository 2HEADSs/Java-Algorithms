import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1, 82, 1};

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
