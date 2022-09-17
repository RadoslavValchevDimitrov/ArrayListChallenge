import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static GroceryList grocerylist = new GroceryList();
    public static void main(String[] args) {

        boolean quit =  false;
        int choice;

        while(!quit){
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocerylist.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }


    }

    public static void addItem(){
        System.out.println("Add an item to the list:");
        String theItem = scanner.nextLine();
        grocerylist.addItem(theItem);

    }

    public static void modifyItem(){
        System.out.println("Enter item name to replace it");
        String oldItem = scanner.nextLine();
        System.out.println("Enter new item to add in the list:");
        String newItem = scanner.nextLine();
        grocerylist.modifyItem(oldItem,newItem);
        System.out.println(oldItem + " is removed from the list " + newItem + " is added to the list");
    }

    public static void removeItem(){
        System.out.println("Enter item name to remove:");
        String item = scanner.nextLine();
        grocerylist.removeItem(item);
    }

    public static void searchItem(){
        System.out.println("Enter item name to search for:");
        String item = scanner.nextLine();
        grocerylist.findItem(item);
    }

    public static void processGroceryList(){
        ArrayList<String> newArrayList=new ArrayList<>();
        newArrayList.addAll(grocerylist.getGroceryList());
        ArrayList<String> anotherArrayList = new ArrayList<>(grocerylist.getGroceryList());
        String [] myArray = new String [grocerylist.getGroceryList().size()];
        myArray=grocerylist.getGroceryList().toArray(myArray);

    }



    public static void printInstructions(){

        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print a list of grocery items.");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for the item in the list ");
        System.out.println( "\t 6 - To quit the application");

    }
}
