package P11;
import java.util.Scanner;

public class ArrayDua29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int data[][] = new int[4][4];
        int jam[] = { 2, 6, 9, 12 };
        int min[] = { 100, 100, 100, 100 };
        int max[] = { -100, -100, -100, -100 }; // Nilai awal yang kecil untuk pencarian maksimum
        double[] total = { 0, 0, 0, 0 };
        double[] rata = { 0, 0, 0, 0 };

        for (int i = 0; i < data.length; i++) {
            System.out.printf("jam %s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu: ");
                        data[i][j] = sc29.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("Masukkan kelembaban udara: ");
                        data[i][j] = sc29.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("Masukkan kecepatan angin: ");
                        data[i][j] = sc29.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("Masukkan index UV: ");
                        data[i][j] = sc29.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                }
                rata[j] = total[j] / data[0].length;
                   }
}
        
        // Menampilkan nilai maksimum dari setiap parameter
        System.out.println("---------------");
        System.out.println("Nilai Maksimum:");
        System.out.println("Suhu maksimum: " + max[0]);
        System.out.println("Kelembaban maksimum: " + max[1]);
        System.out.println("Kecepatan angin maksimum: " + max[2]);
        System.out.println("Index UV maksimum: " + max[3]);

      System.out.println("---------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("---------------");
        System.out.println("Data Kecepatan Angin:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + data[i][2]);
        }
        System.out.println("Index UV maksimum: " + max[3]);
        System.out.printf("Rata-rata suhu: %.2f\n", rata[0]);
        System.out.printf("Persetase kelembaban terendah: %s\n", min[1]);
    }
}