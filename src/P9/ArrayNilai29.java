package P9;

import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i=0; i<nilaiAkhir.length; i++){
            System.out.print("Masukkan Nilai Akhir ke-" + i+ " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++){
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}
