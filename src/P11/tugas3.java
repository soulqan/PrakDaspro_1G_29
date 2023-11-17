package P11;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String[][] daftarAtlet = new String[cabangOlahraga.length][5];
        
        // Input data atlet
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Masukkan data atlet untuk " + cabangOlahraga[i]);
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                daftarAtlet[i][j] = scanner.nextLine();
            }
            System.out.println();
        }

        // Melakukan pengurutan nama atlet dengan pendekatan Selection Sort
        for (int i = 0; i < daftarAtlet.length; i++) {
            for (int j = 0; j < daftarAtlet[i].length - 1; j++) {
                int minIndex = j;
                for (int k = j + 1; k < daftarAtlet[i].length; k++) {
                    if (daftarAtlet[i][k].compareTo(daftarAtlet[i][minIndex]) < 0) {
                        minIndex = k;
                    }
                }
                // Tukar nilai
                String temp = daftarAtlet[i][j];
                daftarAtlet[i][j] = daftarAtlet[i][minIndex];
                daftarAtlet[i][minIndex] = temp;
            }
        }

        // Menampilkan hasil sorting
        System.out.println("Hasil Sorting Nama Atlet:");

        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < daftarAtlet[i].length; j++) {
                System.out.println("Atlet " + (j + 1) + ": " + daftarAtlet[i][j]);
            }
            System.out.println();
        }
    }
}
