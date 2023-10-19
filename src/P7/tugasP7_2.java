import java.util.Scanner;

public class tugasP7_2 {
    public static int NUM_PRODUCTS =10;
public static String produkid ;
public static int jumlahid ;
public static long hargaid ;
public static String itemKeranjang ;
public static int jmlBarangKeranjang ;
public static long totalHarga = 0;
public static Scanner scanner=new Scanner (System.in);
    // Method untuk keranjang
public static void Cart(Scanner scanner) {
    System.out.println("=================================================");
    System.out.println("                    keranjang                 ");
    System.out.println("=================================================");
    System.out.println("Masukkan barang yang akan disewa:");
    String barang = scanner.nextLine();
    barang = scanner.nextLine();

    int indexBarang = -1;
    for (int i = 0; i < NUM_PRODUCTS; i++) {
        if (produkid.equalsIgnoreCase(barang)) {
            indexBarang = i;
            break;
        }
    }
    if (indexBarang == -1) {
        System.out.println("produk tidak ditemukan");
    } else if (jumlahid == 0) {
        System.out.println("sold out");
    } else {
        System.out.println("Masukkan jumlah barang yang akan di sewa:");
        int jumlahBarang = scanner.nextInt();

        if (jumlahBarang > jumlahid) {
            System.out.println("Barang yang di sewa tidak mencukupi");
        } else {
            itemKeranjang = barang;
            jmlBarangKeranjang += jumlahBarang;
            totalHarga += hargaid * jumlahBarang;

            jumlahid -= jumlahBarang;
            System.out.println("barang telah dimasukkan kedalam keranjang");
        }

    }

}
}
