//Problem 02 - by Phạm Công Khiên
package problem02;

import data.*;
import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        doFunction();

    }

    public static void printMenu() {

        System.out.println("Choose the following functions");
        System.out.println("1. Add new Video");
        System.out.println("2. Add new Book on tape");
        System.out.println("3. Add new Furniture");
        System.out.println("4. Show all infomation");
        System.out.println("5. Search for the thing that just  input the serial number");
        System.out.println("6. Update price");
        System.out.println("7. Add all infomation in file.text");
        System.out.println("8. Show all infomation to file.text");
        System.out.println("9. Quit");
    }

    public static void printMenuOfFurniture() {
        System.out.println("Choose the following funcions for furniture");
        System.out.println("1.Add new Cabinet");
        System.out.println("2.Add new Table");
        System.out.println("3.Add other new furniture");
        System.out.println("4. Quit");

    }

    public static void doFunction() {
        System.out.println("Welcome to Rudy's Rental System (RRS)");
        SystemFunction systemFunction = new SystemFunction();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            printMenu();
            while (true) {
                try {
                    System.out.print("Please input a integer (1-9): ");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 8) {
                        break;
                    } else {
                        System.out.println("Input a integer (1-9)");
                    }
                } catch (Exception e) {
                    System.out.println("Input a integer (1-9)");
                }
            }

            switch (choice) {
                case 1:
                    int a;
                    while (true) {
                        try {
                            System.out.print("Input the number of videos you want to import: ");
                            a = Integer.parseInt(sc.nextLine());
                            if (a >= 1) {
                                break;
                            } else {
                                System.out.println("Input a integer >= 1");
                            }
                        } catch (Exception e) {
                            System.out.println("Input a integer >= 1");
                        }
                    }
                    systemFunction.addAVideo(a);
                    break;
                case 2:
                    int b;
                    while (true) {
                        try {
                            System.out.print("Input the number of books you want to import: ");
                            b = Integer.parseInt(sc.nextLine());
                            if (b >= 1) {
                                break;
                            } else {
                                System.out.println("Input a integer >= 1");
                            }
                        } catch (Exception e) {
                            System.out.println("Input a integer >= 1");
                        }
                    }
                    systemFunction.addABookOnTape(b);
                    break;
                case 3:
                    int choiceFurniture;
                    do {
                        printMenuOfFurniture();
                        while (true) {
                            try {
                                System.out.print("Please input a integer (1-3): ");
                                choiceFurniture = Integer.parseInt(sc.nextLine());
                                if (choiceFurniture >= 1 && choiceFurniture <= 4) {
                                    break;
                                } else {
                                    System.out.println("Input a integer (1-4)");
                                }
                            } catch (Exception e) {
                                System.out.println("Input a integer (1-4)");
                            }

                        }

                        switch (choiceFurniture) {
                            case 1:
                                int c;
                                while (true) {
                                    try {
                                        System.out.print("Input the number of cabinets you want to import: ");
                                        c = Integer.parseInt(sc.nextLine());
                                        if (c >= 1) {
                                            break;
                                        } else {
                                            System.out.println("Input a integer >= 1");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Input a integer >= 1");
                                    }
                                }
                                systemFunction.addACabinet(c);
                                break;
                            case 2:
                                int d;
                                while (true) {
                                    try {
                                        System.out.print("Input the number of tables you want to import: ");
                                        d = Integer.parseInt(sc.nextLine());
                                        if (d >= 1) {
                                            break;
                                        } else {
                                            System.out.println("Input a integer >= 1");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Input a integer >= 1");
                                    }
                                }
                                systemFunction.addATable(d);
                                break;
                            case 3:
                                int f;
                                while (true) {
                                    try {
                                        System.out.print("Input the number of other furniture you want to import: ");
                                        f = Integer.parseInt(sc.nextLine());
                                        if (f >= 1) {
                                            break;
                                        } else {
                                            System.out.println("Input a integer >= 1");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Input a integer >= 1");
                                    }
                                }
                                systemFunction.addAFurniture(f);
                                break;
                            case 4:
                                System.out.println("Out functions for furniture");
                                break;

                        }
                    } while (choiceFurniture != 4);

                case 4:
                    systemFunction.showAll();
                    break;
                case 5:
                    systemFunction.searchAThing();
                    break;
                case 6:
                    systemFunction.updatePrice();
                    break;
                case 7:
                    systemFunction.addInfomation();
                    System.out.println("Added information to the file");
                    break;
                case 8:
                    System.out.println("Data in file");
                    systemFunction.showAllInfation();
                    break;
                case 9:
                    System.out.println("Bye bye! See you again!");
                    break;
            }

        } while (choice != 9);
    }

}
