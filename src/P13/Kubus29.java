package P13;

import java.util.Scanner;

public class Kubus29 {
   static int hitungVolume(int sisi){
    int volume =sisi*sisi*sisi;
    return volume;
   }

   static int hitungLuasPermukaan(int sisi){
    int luas=6*sisi*sisi;
    return luas;
   }

   public static void main(String[] args) {
    Scanner sc29 =new Scanner (System.in);

    int v,lp;

    System.out.print("Masukkan panjang sisi: ");
    int sisi = sc29.nextInt();

    v=hitungVolume(sisi);
    System.out.print("Volume kubus: "+v);
    lp=hitungLuasPermukaan(sisi);
    System.out.println("\nLuas Permukaan: "+lp);
   }
}
