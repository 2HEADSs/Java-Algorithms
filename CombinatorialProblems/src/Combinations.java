import java.util.Scanner;

public class Combinations {
    public static String[] elements;
    public static String[] combination;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("//s+");
        int k = Integer.parseInt(scanner.nextLine());
        combination = new String[k];

        combinations(0, 0);
    }

    private static void combinations(int index, int start) {
        if (index == combination.length) {
            print(combination);
        } else {
            for (int i = start; i < elements.length; i++) {
                combination[index] = elements[i];
                combinations(index + 1, i + 1);
            }
        }
    }


    private static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}
