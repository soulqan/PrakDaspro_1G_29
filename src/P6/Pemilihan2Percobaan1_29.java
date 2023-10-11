package P6;

import java.util.Scanner;

public class Pemilihan2Percobaan1_29 {
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);
        int tahun;
        
        System.out.println("masukkan tahun: ");
        tahun=input29.nextInt();
        if (tahun%4==0) {
            if (tahun%100!=0) 
                System.out.println("tahun Kabisat");
        }else 
            System.out.println("Bukan Tahun Kabisat");

    }
}
