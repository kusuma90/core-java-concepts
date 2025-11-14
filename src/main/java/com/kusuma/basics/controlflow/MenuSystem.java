package main.java.com.kusuma.basics.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {

    List<String> user = new ArrayList<>();

    private final Scanner sc = new Scanner(System.in);

    public void start(){
        int choice;
        //Do while for check option atleast once
        do{
            displayMenu();

            choice = getValidChoice();

            //Switch to choose method to perform
            switch(choice){
                case 1 -> addUser();
                case 2 -> listUsers();
                case 3 -> searchUser();
                case 4 -> {
                    System.out.println("Good bye");
                    break;
                }
                default -> System.out.println();
            }
        }while(choice!=4);
    }
  private void  displayMenu(){
        System.out.println("""
                ======== User Management =============
                1. Add User
                2. List Users
                3. Search User
                4. Exit
                Choose[1-4] """);
  }

  private int getValidChoice(){
        int input;
        //while, if conditions for check enter input and valid it
        while(true){
            if(sc.hasNextInt()){
                input = sc.nextInt();
                if(input >=1 && input <=4){
                    sc.nextLine();
                    return input;
                }
            }else{
                sc.nextLine();
            }
            System.out.println("Invalid! Enter[1-4");
        }
  }

  public static void main(String[] args){
        MenuSystem ms = new MenuSystem();
        ms.start();
  }

  private void addUser(){
        user.add("Apple");
  }

  private void listUsers(){
        System.out.println(user.toString());
  }
  private void searchUser(){
        System.out.println(user.toString());
  }
}
