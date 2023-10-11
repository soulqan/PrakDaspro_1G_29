package P6;

import java.util.Scanner;

public class tugasP6_29 {
public static void main(String[] args) {
    Scanner input29= new Scanner(System.in);

    boolean adaBarangDalamKeranjang;
    long totalHargaFinal;
    String jawaban;

    System.out.println("Masukkan total harga : ");
    totalHargaFinal=input29.nextLong();
    if (totalHargaFinal>=1) {
        adaBarangDalamKeranjang = true;
    
     if (totalHargaFinal<1) 
        adaBarangDalamKeranjang=false;

     if (totalHargaFinal>=1&&adaBarangDalamKeranjang) 
    System.out.println("apakah anda ingin membayar dengan harga yang tertera?(y/n):");
    jawaban=input29.next();
    if (jawaban.equals("y")) {
        System.out.println("Pembayaran berhasil");

    }else {
        System.out.println("pembayaran Tidak Valid");
    }
    }else{
        System.out.println("keranjang masih kosong");
    }
}
 

}
    
