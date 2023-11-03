package P9;

import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan jumlah mahasiswa: ");
    int n = sc.nextInt();

    int[] nilaiMhs= new int[n];
    double total1= 0,total2=0,total=0;
    double rata2,rata21,rata22;
    int jumlahLulus=0,jumlahTidakLulus=0;

    for(int i = 0; i< nilaiMhs.length;i++){
        System.out.println("Masukkan Nilai mahasiswa Ke-" + (i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (int i =0; i< nilaiMhs.length;i++){
        total+=nilaiMhs[i];
    }
    

    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs [i] > 70) {
            total1+=nilaiMhs[i];
            jumlahLulus++;
        }else{
            total2+=nilaiMhs[i];
            jumlahTidakLulus++;
        }
        }
        System.out.println("banyak nya mahasiswa yang lulus: "+jumlahLulus);
        rata21 =total1/jumlahLulus;
        System.out.println("Rata-rata nilai lulus = "+rata21);
        rata22 = total2 / jumlahTidakLulus;
        System.out.println("Rata-rata nilai tidak lulus = "+rata22);
        rata2 = total/nilaiMhs.length;
    System.out.println("Rata-rata nilai = "+rata2);
        
    
    }

}
