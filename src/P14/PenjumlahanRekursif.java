package P14;

import java.util.Scanner;

public class PenjumlahanRekursif {

    static int penjumlahanRekursif(int n,int f) {
        if (n == f) {
            System.out.print(f + " = ");
            return n;
        } else {
            System.out.print(f + " + ");
            return f + penjumlahanRekursif(n,f+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai f: ");
        int f = sc.nextInt(); 
        int n=1;
        int hasil = penjumlahanRekursif(f,n);
        System.out.print(hasil);
    }
}