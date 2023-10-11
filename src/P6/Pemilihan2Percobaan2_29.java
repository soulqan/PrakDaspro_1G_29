package P6;

import java.util.Scanner;

public class Pemilihan2Percobaan2_29 {
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalSudut;

        System.out.println("Masukkan sudut ke-1 : ");
        sudut1 =input29.nextFloat();
        System.out.println("masukkan sudut ke-2 : ");
        sudut2=input29.nextFloat();
        System.out.println("masukkan sudut ke-3 : ");
        sudut3=input29.nextFloat();
        totalSudut=sudut1+sudut2+sudut3;

        if (totalSudut==180) {
            if (sudut1==90||sudut2==90||sudut3==90) {
                System.out.println("segitiga siku siku");
            }else if((sudut1==70&&sudut2==70)||(sudut1==70&&sudut3==70)||(sudut2==70&&sudut3==70)){
            System.out.println("Segitiga sama kaki");
            }else {
                System.out.println("Segitiga Sembarang");
            }
        }else
            System.out.println("Bukan Segitiga");
        }

    }

