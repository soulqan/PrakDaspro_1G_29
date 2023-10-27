package P7;
import java.util.Scanner;

public class tugasP7_1 {

public static Scanner scanner=new Scanner (System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=================================================");
            System.out.println ("                   Main Menu                   ");
            System.out.println("=================================================");
            System.out.println("\n1. Profile");
            System.out.println("2. Camping Equipment Inventory");
            System.out.println("3. Cart");
            System.out.println("4. Remove Product from Cart");
            System.out.println("5. Rent Equipment");
            System.out.println("6. Delivery Options");
            System.out.println("7. Payment");
            System.out.println("8. Customer Service");
            System.out.println("9. Return Equipment");
            System.out.println("10. Earnings and Feedback");
            System.out.println("11. Add New Item");
            System.out.println("12. Exit");
            System.out.print("\nSelect an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Profile();
                    break;
                case 2:
                    Inventory(scanner);
                    break;
                case 3:
                    Cart(scanner);
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    RentEquipment();
                    break;
                case 6:
                    DeliveryOptions();
                    break;
                case 7:
                    Payment();
                    break;
                case 8:
                    CustomerService();
                    break;
                case 9:
                    ReturnEquipment();
                    break;
                case 10:
                    EarningsAndFeedback();
                    break;
                case 11:
                    AddNewItem();
                    break;
                case 12:
                    Exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 12);
}
public static void Exit() {

    }

public static void AddNewItem() {
    
}

public static void ReturnEquipment() {

}

public static void EarningsAndFeedback() {

}

public static void CustomerService() {

}

public static void Payment() {

}

public static void RentEquipment() {

}

public static void DeliveryOptions() {

}

public static void removeProduct() {

}

public static void Inventory(Scanner scanner) {

}

public static void Profile() {

}
public static void Cart(Scanner scanner) {

}


}