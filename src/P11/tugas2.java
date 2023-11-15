package P11;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int nilaiN = input.nextInt();

        if (nilaiN >= 3) {
            for (int i = 1; i <= nilaiN; i++) {
                for (int j = 1; j <= nilaiN; j++) {
                    if (i == 1 || i == nilaiN || j == 1 || j == nilaiN) {
                        System.out.print(nilaiN + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N harus minimal 3");
        }
    }
}
