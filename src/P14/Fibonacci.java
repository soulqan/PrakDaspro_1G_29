package P14;

import java.util.Scanner;

public class Fibonacci {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bulan yang ingin dihitung: ");
        int bulan = scanner.nextInt();

        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);

        scanner.close();
    }

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1; // Jumlah pasangan pada bulan 1 dan 2 adalah 1 sesuai urutan Fibonacci
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}