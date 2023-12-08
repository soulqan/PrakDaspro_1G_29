package P14;

import java.util.Scanner;

public class CekPrimaRekursif {

    static boolean cekPrimaRekursif(int n, int pembagi) {
        if (n <= 2) {
            return (n == 2);
        }
        if  (pembagi == 1) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return cekPrimaRekursif(n, pembagi - 1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        boolean hasil = cekPrimaRekursif(angka, angka - 1);
        if (hasil) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
}
