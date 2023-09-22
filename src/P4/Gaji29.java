package P4;
import java.util.Scanner;
public class Gaji29 {
    public static void main(String[] args) {
        Scanner input29= new Scanner(System.in);

        int jmlMasuk,jmlTidakMasuk,totGaji,gaji,potGaji;

        System.out.println("Masukkan jumlah hari anda masuk: ");
        jmlMasuk=input29.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk:" );
        jmlTidakMasuk=input29.nextInt();
        System.out.println("Masukkan jumlah gaji: ");
        gaji=input29.nextInt();
        System.out.println("Masukkan jumlah potongan gaji: ");
        potGaji=input29.nextInt();
        totGaji=(jmlMasuk*gaji)-(jmlTidakMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah  "+totGaji);
    }

}

