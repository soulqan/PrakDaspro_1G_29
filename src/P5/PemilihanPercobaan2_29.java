package P5;

import java.util.Scanner;

public class PemilihanPercobaan2_29 {
    public static void main(String[] args) {
        Scanner input29= new Scanner(System.in);
        String nilaiHuruf;
        System.out.println("Nilai UAS     :");
        float uas = input29.nextFloat();
        System.out.println("Nilai UTS     :");
        float uts = input29.nextFloat();
        System.out.println("Nilai Kuis    :");
        float kuis =input29.nextFloat();
        System.out.println("Nilai Tugas   :");
        float tugas = input29.nextFloat();

        float total =(uas*0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "tidak Remidi";

        System.out.println("Nilai Akhir = "+total+ " sehingga "+message);
        if (total > 80) {
            nilaiHuruf = "A"; 
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if (total > 73){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if(total > 65){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if(total > 60){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if (total > 50) {
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if (total > 39) {
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }else if (total <= 39) {
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf Anda Adalah : "+ nilaiHuruf );
        }
    }

}