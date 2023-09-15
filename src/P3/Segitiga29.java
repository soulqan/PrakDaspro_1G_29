package P3;
import java.util.Scanner;

public class Segitiga29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc29.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc29.nextInt();

        luas = alas*tinggi /2;

        System.out.println("Luas segitiga: " + luas);
    }
    
}
