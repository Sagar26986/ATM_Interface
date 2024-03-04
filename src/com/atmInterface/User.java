package com.atmInterface;

//User.java
public class User {
 private int userID;
 private int userPIN;
 private double accountBalance;

 public User(int userID, int userPIN, double initialBalance) {
     this.userID = userID;
     this.userPIN = userPIN;
     this.accountBalance = initialBalance;
 }

 public int getUserID() {
     return userID;
 }

 public boolean validatePIN(int enteredPIN) {
     return userPIN == enteredPIN;
 }

 public double getAccountBalance() {
     return accountBalance;
 }

 public void deposit(double amount) {
     accountBalance += amount;
 }

 public boolean withdraw(double amount) {
     if (amount <= accountBalance) {
         accountBalance -= amount;
         return true;
     }
     return false;
 }
}

