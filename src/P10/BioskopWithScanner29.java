package P10;

import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc29 =new Scanner(System.in);
        String nama,next;
        int baris, kolom,menu;


        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            menu=sc29.nextInt();
            sc29.nextLine();
            
        switch (menu) {
            case 1:
            for (int i = 0 ;i<penonton.length;i++){
                               
                System.out.print("Input Nama Penonton: ");
                nama=sc29.nextLine();
                System.out.print("Masukkan Baris: ");
                baris=sc29.nextInt();
                System.out.print("Masukkan Kolom : ");
                kolom=sc29.nextInt();
                
                if (penonton[baris -1][kolom -1]==null) {
                penonton[baris -1][kolom -1]= nama;   
                }else{
                    System.out.println("Kursi Sudah Terisi! atas nama: "+penonton[baris -1][kolom -1] +"memasukkan baris dan kolom kembali");
                }
                System.out.println("Input Penonton lainnya? (y/n): ");
                next=sc29.next();
                sc29.nextLine();
                 if (next.equalsIgnoreCase("n")){
                     break;
                 }
                }break;
                
            case 2:
            for (int i = 0 ;i<penonton.length;i++) {
                for (int j = 0 ;j < penonton[i].length;j++ ) {
                    if (penonton[i][j] !=null){
                        System.out.println("Baris "+(i+1)+" Kolom "+(j+1)+ " : " + penonton[i][j] );
                    }else{
                        System.out.println("Baris "+(i+1)+" Kolom "+(j+1)+ " : " + null);
                    }
                }
            }break;
            case 3:
            System.out.println("Terima Kasih");
            System.exit(0);
        default :
        System.out.println("Menu tidak tersedia!");
        break;
        }
       }
    }
}
    

