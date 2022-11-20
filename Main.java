import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
            
            System.out.println("Press 1 to add an item.");
            System.out.println("Press 2 to delete an item.");
            System.out.println("Press 3 to update.");
            System.out.println("Press 4 to show all the items.");
            System.out.println("Press 5 to quit the program.");

            option = scanner.nextInt();
            scanner.nextLine();
            //add item
            if(option == 1){

                System.out.println("Enter the name:");
                String name = scanner.nextLine();
                
                System.out.println("Enter the serial number:");
                String serialNumber = scanner.nextLine();

                System.out.println("Enter the value in dollars (whole number):");
                int value = scanner.nextInt();
                scanner.nextLine();
                inventory.addItem(name, serialNumber, value);
            }
             
            else if(option == 2){
                System.out.println("Enter the serial number of the item to delte:");
                String serialNumber = scanner.nextLine();
                inventory.deleteItem(serialNumber);
            }
            else if(option == 3){

                System.out.println("Enter the serial number of the item to change:");
                String serialNumber = scanner.nextLine();
                
                System.out.println("Enter the new name:");
                String newName = scanner.nextLine();

                System.out.println("Enter the new value in dollars (whole number):");
                int newValue = scanner.nextInt();
                scanner.nextLine();
                inventory.updateItem(serialNumber, newName, newValue);
            }
            else if(option == 4){
                
                inventory.showAllItems();
            }

            else if(option == 5){
                
                break;
            }
        }
        scanner.close();
    }
}
