package P5;

import java.util.Scanner;

public class PemilihanPercobaan1_29 {
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);
        System.out.print("Masukan angka:  ");
    int angka = input29.nextInt();
    
    String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
    System.out.println("Angka ini adalah "+ hasil);
    }
    
}



    

