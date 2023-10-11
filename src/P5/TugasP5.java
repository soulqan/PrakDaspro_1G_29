package P5;

import java.util.Scanner;

public class TugasP5 {
       
    public static void main(String[] args) {
    Scanner input29=new Scanner(System.in);
    String opsiPengiriman;
    
    System.out.println("masukan ekspedisi:");
    opsiPengiriman=input29.nextLine();
    if (opsiPengiriman.equalsIgnoreCase("JNT")) {
        System.out.println("ekspedisi yang anda pili adalah :"+opsiPengiriman);
    }else if(opsiPengiriman.equalsIgnoreCase("JNE")){
        System.out.println("ekspedisi yang anda pilih adalah : "+opsiPengiriman);
        }
    }
}
