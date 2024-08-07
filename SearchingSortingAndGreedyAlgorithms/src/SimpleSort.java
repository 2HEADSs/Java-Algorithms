import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {5, 4, 3, 2, 1,82,1};

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int firstElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[firstElementIndex]) {
                    firstElementIndex = j;
                }
            }
            swap(arr, i, firstElementIndex);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
