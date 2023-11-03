package studiKasus;

import java.util.Random;
import java.util.Scanner;

public class randomAngka {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rend = new Random();

    int angkaRand =rend.nextInt(50);
    int tebakAngka;

    for(int i = 0;i<angkaRand;i++){
        System.out.print("Masukkan Angka : ");
        tebakAngka=sc.nextInt();
        if (tebakAngka<angkaRand) {
            System.out.println("Terlalu Kecil");
        }
        else if (tebakAngka>angkaRand) {
            System.out.println("Terlalu Besar");
        }else{
            System.out.println("Selamat Anda Benar!");
            break;
        }
        
        }
    }
}
