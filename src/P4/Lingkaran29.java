package P4;

import java.util.Scanner;

public class Lingkaran29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
    int r;
    double keliling,luas,phi=3.14;

    System.out.println("Masukkan Jari-Jari lingkaran: ");
    r= input29.nextInt();
    keliling=2*phi*r;
    luas=phi*r*r;
    System.out.println(keliling);
    System.out.println(luas);
    }
    
    
 
}
