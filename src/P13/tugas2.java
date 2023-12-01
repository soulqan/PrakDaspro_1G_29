package P13;

import java.util.Scanner;

public class tugas2 {
    static int[][] nilai = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 30, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 10, 5, 45},
        {50, 0, 7, 8, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };
    static String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu pertama sampai ketujuh
    static void tampilkanNilaiMahasiswa() {
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nilai " + nama[i] + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
    static void cariHariNilaiTertinggi() {
        int[] totalNilaiPerHari = new int[nilai[0].length];

        // Menghitung total nilai per hari dari semua mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilaiPerHari[j] += nilai[i][j];
            }
        }

        // Mencari hari dengan nilai tertinggi
        int hariTertinggi = 0;
        int nilaiTertinggi = totalNilaiPerHari[0];
        for (int i = 1; i < totalNilaiPerHari.length; i++) {
            if (totalNilaiPerHari[i] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiPerHari[i];
                hariTertinggi = i;
            }
        }

        System.out.println("Hari dengan nilai tertinggi adalah hari ke-" + (hariTertinggi + 1));
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi beserta keterangan nilai dari minggu ke-
    static void tampilkanMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = 0;

        for (int i = 0; i < nilai.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " + nama[mahasiswaTertinggi]);
        System.out.println("Nilai dari minggu ke-");
        for (int i = 0; i < nilai[mahasiswaTertinggi].length; i++) {
            System.out.println("Minggu ke-" + (i + 1) + ": " + nilai[mahasiswaTertinggi][i]);
        }
    }

    // Fungsi untuk menambahkan data nilai mahasiswa
    static void tambahDataNilai() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nama.length; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa " + nama[i] + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        // Contoh pemanggilan fungsi
        tampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
        // Untuk menambahkan data nilai gunakan fungsi tambahDataNilai()
    }
}
