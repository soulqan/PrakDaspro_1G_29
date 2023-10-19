

import java.util.Scanner;

public class DoWhileCuti29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = scan29.nextInt();

        while (jatahCuti > 0) {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan29.next();
            if ("Y".equalsIgnoreCase(konfirmasi)) {
                System.out.println("Jumlah hari: ");
                jumlahHari = scan29.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            } else {
                break;
            }
 }}
}