package P13;

import java.util.Scanner;

public class Ucapan_29 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Tuliskan Nama Orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
       String nama = PenerimaUcapan();
       System.out.println("Thank you "+nama+"\nmay the force be with you"); 
    }
}
