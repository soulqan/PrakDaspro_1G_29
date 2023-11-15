package P11;
import java.util.Scanner;

public class NestedLoop_2341720191 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc29.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan array menggunakan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}

