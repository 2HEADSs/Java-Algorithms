//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        for (int m = 0; m < 9; m++) {
                            System.out.println(String.format("%d%d%d%d%d",i,j,k,l,m));
                        }
                    }
                }
            }
        }
    }
}