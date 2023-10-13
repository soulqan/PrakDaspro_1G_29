package P7;

import java.util.Scanner;

public class ForKelipatan29 {
   
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);
        int kelipatan,counter=0,total=0;
        
        
    System.out.print("Masukkan bilanagan kelipatan (1-9): ");
    kelipatan =input29.nextInt();

    for(int i=1;i<=50;i++){
        if (i % kelipatan == 0) {
            total+=i;
            counter++;
            double rata=total/counter;
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah%d\n ",kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah%d\n", kelipatan,total);
        System.out.println("rata- rata adalah : "+rata);
        }
    }
        
}
}


