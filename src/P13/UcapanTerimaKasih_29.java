package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_29 {
    public static String PenerimaUcapan(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
    }

    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like I could ask you anything.");

        UcapanTambahan("Tetap semangat berbuat baik");
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println("tambahan pesanan: " + tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}
