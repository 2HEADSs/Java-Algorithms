import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long fact = calculateFactorial(n);

        System.out.println(fact);
    }

    private static long calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
