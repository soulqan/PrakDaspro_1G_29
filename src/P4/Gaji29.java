package P4;
import java.util.Scanner;
public class Gaji29 {
    public static void main(String[] args) {
        Scanner input29= new Scanner(System.in);

        int jmlMasuk,jmlTidakMasuk,totGaji,gaji=40000,potGaji=25000;

        System.out.println("Masukkan Jumlah hari anda masuk: ");
        jmlMasuk=input29.nextInt();
        System.out.println("Masukkan Jumlah hari tidak masuk:" );
        jmlTidakMasuk=input29.nextInt();
        totGaji=(jmlMasuk*gaji*jmlTidakMasuk*potGaji);
        System.out.println("Gaji yang anda terima"+totGaji);
    }

}
