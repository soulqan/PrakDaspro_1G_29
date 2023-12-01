package P13;

import java.util.Scanner;

public class tugas2 {
    static int[][] nilai;
    static String[] nama;
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

    static void inputJumlahMahasiswaDanTugas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahTugas];
        nama = new String[jumlahMahasiswa];

        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = scanner.nextLine();
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai mahasiswa tugas ke-"+(j+1)+": ");
                nilai[i][j] = scanner.nextInt();
                scanner.nextLine();
                
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        inputJumlahMahasiswaDanTugas();
        tampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
        // Untuk menambahkan data nilai gunakan fungsi tambahDataNilai()
    }
}
