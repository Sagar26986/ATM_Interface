package com.atmInterface;


public class ATM {
 private User user;

 public ATM(User user) {
     this.user = user;
 }

 public void checkBalance() {
     System.out.println("Current Balance: $" + user.getAccountBalance());
 }

 public void deposit(double amount) {
     user.deposit(amount);
     System.out.println("$" + amount + " deposited successfully.");
 }

 public void withdraw(double amount) {
     if (user.withdraw(amount)) {
         System.out.println("$" + amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient funds.");
     }
 }
}

