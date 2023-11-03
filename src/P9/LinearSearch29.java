package P9;

import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int hasil=0;        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah=sc.nextInt();
        int[] arrayInt = new int[jumlah];
        boolean ishasil=true;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari: ");
        int key=sc.nextInt();
        for(int i = 0;i<arrayInt.length;i++){
            if (arrayInt[i] == key){
                hasil = i;
                ishasil=true;
                break;
        }else{
            ishasil=false;
        }
    }
    if(ishasil==true){
    System.out.println("Key ada pada indeks ke-"+hasil);
    } else {
        System.out.println("Key tidak ditemukan");
        }
    
}
}
