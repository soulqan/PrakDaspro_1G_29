package P10;

import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc29 =new Scanner(System.in);
        String nama,next;
        int baris, kolom;


        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc29.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc29.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc29.nextInt();
            sc29.nextLine();

            penonton[baris-1][kolom-1]= nama;

            System.out.print("input penonton lainnya? (y/n): ");
            next =sc29.nextLine();
            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
        }
        }
    

