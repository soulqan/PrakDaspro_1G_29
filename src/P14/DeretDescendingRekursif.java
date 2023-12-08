package P14;

import java.util.Scanner;

public class DeretDescendingRekursif {
    
    // Fungsi rekursif untuk menampilkan bilangan dari n sampai 0
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    
    // Fungsi iteratif untuk menampilkan bilangan dari n sampai 0
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt(); // Ubah nilai n sesuai keinginan
        
        System.out.println("Deret Descending Rekursif:");
        deretDescendingRekursif(n);
        
        System.out.println("\n\nDeret Descending Iteratif:");
        deretDescendingIteratif(n);
    }
}
