import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int f = n;

        drawFigure(n, f);
    }

    private static void drawFigure(int n, int f) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        drawFigure(n - 1, f + 1);

        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

}
