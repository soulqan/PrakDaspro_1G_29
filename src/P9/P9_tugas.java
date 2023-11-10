package P9;

import java.util.Scanner;

public class P9_tugas {
    public static void main(String[] args) {
        int nilai=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Masukkan banyak elemen: ");
        int elemen=sc.nextInt();
        double nilaiRataRata=0.0;
        int []banyakElemen=new int [elemen];
        for (int i = 0; i < banyakElemen.length; i++) {
            System.out.println("Masukkan nilai elemen: ");
            banyakElemen[i]=sc.nextInt();
          }
          int nilaiTertinggi = banyakElemen[0];
          int nilaiTerendah = banyakElemen[0];
          int total = banyakElemen[0];
          for (int i = 1; i < banyakElemen.length; i++){
            if (nilaiTertinggi<banyakElemen[i]){
                nilaiTertinggi=banyakElemen[i];
                }
                if (nilaiTerendah>banyakElemen[i]){
                    nilaiTerendah=banyakElemen[i];
                    }
                    total+=banyakElemen[i];
                    nilaiRataRata =(double)total/elemen;
                }
                    System.out.print("Nilai tertinggi : "+nilaiTertinggi+"\n");
                    System.out.print("Nilai terendah  : "+nilaiTerendah+"\n");
                    System.out.print("rata-rata       : "+nilaiRataRata);
                
    }
}
