import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = (Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt))
                .toArray();
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += arr[i];
        }
        System.out.println("Itteration sum:" + sum);
    }
}
