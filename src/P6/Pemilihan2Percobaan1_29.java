package P6;
import java.util.Scanner;
public class Pemilihan2Percobaan1_29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
            System.out.print(" Massukkan Angka= ");
        int tahun = input29.nextInt();
        if (( tahun %4)==0){
            if ((tahun % 100)!=0){
            System.out.println("Bukan Tahun Kabisat");
            }else if ((tahun%400!=0));
            System.out.println("tahun kabisat");
        } else 
            System.out.println( " tahun kabisat ");
}

}