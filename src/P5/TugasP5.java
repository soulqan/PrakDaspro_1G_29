package P5;

import java.util.Scanner;

public class TugasP5 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int opsiPengiriman, metodePembayaran;

        System.out.println("====== Pilihlah Opsi Pengiriman ======");
        System.out.println("1. JNT \n2. JNE \n3. GoJek \n4. Grab ");
        System.out.print("Pilihan: ");
        opsiPengiriman = input29.nextInt();

        if (opsiPengiriman == 1) {
            System.out.println("Anda memilih opsi pengiriman JNT");
        } else if (opsiPengiriman == 2) {
            System.out.println("Anda memilih opsi pengiriman JNE");
        } else if (opsiPengiriman == 3) {
            System.out.println("Anda memilih opsi pengiriman GoJek");
        } else if (opsiPengiriman == 4) {
            System.out.println("Anda memilih opsi pengiriman Grab");
        } else {
            System.out.println("Tidak ada opsi pengiriman tersebut");
 }
}
}
