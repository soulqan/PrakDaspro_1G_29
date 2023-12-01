package P13;

import java.util.Scanner;

public class Percobaan6_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;
        System.out.println("Masukkan panjang ");
        p=input.nextInt();
        System.out.println("masukkan lebar");
        l=input.nextInt();
        System.out.println("masukkan tinggi");
        t=input.nextInt();

    

        L=hitungLuas(p,l);
        System.out.println("luas persegi panjang adalah "+L);
        vol=hitungVolume(p,l,t);
        System.out.println("Volume Balok adalah "+vol);

    }
    static int hitungLuas(int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }
}
