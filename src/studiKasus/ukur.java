package studiKasus;

import java.util.Scanner;

public class ukur {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double beratBadan,tinggiBadan,imt;
    System.out.println("Masukkan Berat Badan Anda (kg): ");
    beratBadan = input.nextDouble();
    System.out.println("Masukkan Tinggi Badan Anda (cm): ");
    tinggiBadan = input.nextDouble()/100; 
    imt=beratBadan/(tinggiBadan*tinggiBadan);
    System.out.printf("IMT Anda adalah: %.1f ", imt);
    

    if (imt<17) {
        System.out.println("Sangat Kurus");
    }else if (imt>=17&&imt<18.5){
        System.out.println("Kurus");
    }
    else if (imt>=18.5&&imt<=25.0){
        System.out.println("Normal");
    }else if (imt>25&&imt<=27) {
        System.out.println("Gemuk");
    }
    else{
        System.out.println("Obesitas");
    }
}
}