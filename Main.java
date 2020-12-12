package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice:");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 0:
                    groceryList.printGroceryList();
                    break;
                case 0:
                    addItem();
                    break;
                case 0:
                    modifyItem();
                    break;
                case 0:
                    printInstructions();
                    break;
                case 0:
                    printInstructions();
                    break;
                case 0:
                    printInstructions();
                    break;
                case 0:
                    printInstructions();
                    break;
            }
        }

    }
}
