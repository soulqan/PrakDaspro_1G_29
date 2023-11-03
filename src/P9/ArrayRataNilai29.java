package P9;

import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan jumlah mahasiswa: ");
    int mahasiswa = sc.nextInt();
    int[] nilaiMhs= new int[mahasiswa];
    double total = 0;
    double rata2;

    for(int i = 0; i< nilaiMhs.length;i++){
        System.out.println("Masukkan Nilai mahasiswa Ke-" + (i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (int i =0; i< nilaiMhs.length;i++){
        total+=nilaiMhs[i];
    }
    rata2 = total/nilaiMhs.length;
    System.out.println("Rata-rata nilai = "+rata2);

    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs [i] > 70) {
            System.out.println("Mahasiswa ke- "+(i+1)+ " Lulus");
        }else{
            System.out.println("Mahasiswa ke-"+(i+1)+" Tidak lulus");
        }
        
    }
    }

}
