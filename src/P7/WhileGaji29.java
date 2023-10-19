

import java.util.Scanner;

public class WhileGaji29 {
    public static void main(String[] args) {
        Scanner scan29= new Scanner(System.in);
        int jumlahKaryawan,jumlahJamLembur;
        double gajiLembur=0,totalGajiLembur=0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan29.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke- "+(i+1) + ": ");
            jabatan = scan29.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan29.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktut")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = (jumlahJamLembur * 100000);
            }else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }else{
                System.out.println("jabatan Invalid");
            }
           
        }
        totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
}
}