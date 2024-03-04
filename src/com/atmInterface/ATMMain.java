package com.atmInterface;

//ATMMain.java
import java.util.Scanner;

public class ATMMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Create a user with userID, userPIN, and initial balance
     User user = new User(12345, 5678, 1000.0);

     // Create an ATM instance with the user
     ATM atm = new ATM(user);

     // User authentication
     System.out.print("Enter User ID: ");
     int enteredUserID = scanner.nextInt();

     System.out.print("Enter PIN: ");
     int enteredPIN = scanner.nextInt();

     if (user.getUserID() == enteredUserID && user.validatePIN(enteredPIN)) {
         System.out.println("Authentication successful. Welcome to the ATM!");
         performATMOperations(scanner, atm);
     } else {
         System.out.println("Authentication failed. Exiting...");
     }

     scanner.close();
 }

 private static void performATMOperations(Scanner scanner, ATM atm) {
     int choice;
     do {
         System.out.println("\nATM Menu:");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");

         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 atm.checkBalance();
                 break;
             case 2:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = scanner.nextDouble();
                 atm.deposit(depositAmount);
                 break;
             case 3:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 atm.withdraw(withdrawAmount);
                 break;
             case 4:
                 System.out.println("Thank you for using ATM. Goodbye!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         }
     } while (choice != 4);
 }
}

