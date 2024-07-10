import java.util.Scanner;

public class GeneratingVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Integer[] memory = new Integer[n];

        fillVector(memory, memory.length - 1);
    }

    private static void fillVector(Integer[] memory, int index) {
        if (index < 0) {
            print(memory);
            return;
        }
        fillVector(memory, index - 1);
    }

    private static void print(Integer[] memory) {
        for (Integer integer : memory) {
            System.out.print(integer);
        }
        System.out.println();
    }
}
