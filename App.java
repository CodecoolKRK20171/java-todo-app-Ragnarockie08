/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */

import java.util.Scanner;

public class App{

    static Scanner scanner;
    static TodoList list = new TodoList();

    public static void main(String[] args) {

        start();

    }

    public static void start(){

        String option = "";

        while (!option.equals("0")){

            System.out.println("Welcome in Todo List app\n"
                                + "(1) to add item\n"
                                + "(2) to mark item\n"
                                + "(3) printlist\n"
                                + "(0) to exit");

            scanner = new Scanner(System.in);
            option = scanner.nextLine();

            if (option.equals("1")){
                additem();
            }else if(option.equals("2")){
                markItem();
            }else if(option.equals("3")){
                list.printList();
            }
            else {
                System.exit(0);
            }
        }
    }
    
    public static void additem(){
        System.out.println("Enter item title: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        TodoItem item = new TodoItem(name);
        list.addItem(item);
    }

    public static void markItem(){
        list.printList();
        System.out.println("Enter item to mark/unmark: ");
        scanner = new Scanner(System.in);
        Integer listNo = scanner.nextInt();
        try{
            list.todoItems.get(listNo-1).setMark();
        }catch (IndexOutOfBoundsException e){
            System.out.println("No such an item in list!");
            System.exit(0);
        }
    }
}
