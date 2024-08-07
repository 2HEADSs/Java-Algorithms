import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = (Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt))
                .toArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Iteration sum:" + sum);
//        sum += sumNumbers(arr, 0);
//        with comment part in recursion
        sum = sumNumbers(arr, 0);
        System.out.println("Recursion sum:" + sum);
    }

    public static int sumNumbers(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }

//                return sumNumbers(numbers, index + 1);
        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
