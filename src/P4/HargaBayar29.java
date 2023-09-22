package P4;

import java.util.Scanner;

public class HargaBayar29 {
    public static void main(String[] args) {
        Scanner inpuut29=new Scanner(System.in);
    String merkBuku;
    int harga,jumlah, jumlahHalamanBuku;
    double dis, total, bayar, jmlDis;
    System.out.println("Masukkan harga barang yang dibeli");
    harga=inpuut29.nextInt();
    System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
    jumlah=inpuut29.nextInt();
    inpuut29.nextLine();
    System.out.println("Masukkan merk buku ");
    merkBuku=inpuut29.nextLine();
    System.out.println("Masukkan jumlah halaman");
    jumlahHalamanBuku=inpuut29.nextInt();
    System.out.println("Masukkan besaran diskon");
    dis=inpuut29.nextDouble(); 
    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("Merk buku nya adalah :" +merkBuku);
    System.out.println("Jumlah halaman: "+jumlahHalamanBuku);
    System.out.println("Diskon yang anda dapatkan adalah "+jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah "+bayar);

    }
}
