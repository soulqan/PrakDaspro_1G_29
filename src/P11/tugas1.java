package P11;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int nilaiN = input.nextInt();

        if (nilaiN >= 3) {
            for (int i = 1; i <= nilaiN; i++) {
                for (int j = 1; j <= nilaiN - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N harus minimal 3");
        }
    }
}


