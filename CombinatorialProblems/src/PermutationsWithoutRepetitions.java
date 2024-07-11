import java.util.Scanner;

public class PermutationsWithoutRepetitions {
    public static String[] elements = {"A", "B", "C"};
    public static String[] permites = new String[elements.length];

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        permute(0);
    }

    private static void permute(int index) {
        if (index == elements.length) {
            print();
            return;
        }
    }

    private static void print() {
        System.out.println(String.join(" ", permites));
    }
}
