package P9;

import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int hasil=0;        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah=sc.nextInt();
        int[] arrayInt = new int[jumlah];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari: ");
        int key=sc.nextInt();
        for(int i = 0;i<arrayInt.length;i++){
            if (arrayInt[i] == key){
                hasil = i;
                break;
        }
    }
    System.out.println("key ada dalam array pada posisi indeks ke-"+hasil);
}
}
