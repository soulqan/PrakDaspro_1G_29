package studiKasus;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        double potgaji;
        long total =0;
        long gaji;
        long jumlah,thr; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok anda: ");
       gaji = sc.nextLong();

        potgaji = gaji * 0.05;
        jumlah= gaji - (long)potgaji;
        thr=gaji+55000;
        total+= jumlah+thr;

        System.out.println("pendapatan anda adalah: "+ total);
    }
}
