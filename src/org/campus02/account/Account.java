package org.campus02.account;

public class Account {

  private String owner;
  private double balance;
  private double overdraftFrame;

  public Account(String owner, double balance, double overdraftFrame) {
    this.owner = owner;
    this.balance = balance;
    this.overdraftFrame = overdraftFrame;
  }

  public String getOwner() {
    return owner;
  }

  public double getBalance() {
    return balance;
  }

  public double getOverdraftFrame() {
    return overdraftFrame;
  }

  public void credit(double amount) {
    balance += amount;
  }

  public void debit(double amount)
      throws NotEnoughMoneyException {
    if(amount > balance + overdraftFrame) {
      throw new NotEnoughMoneyException("balance too low!");
    }
    balance -= amount;
  }

  @Override
  public String toString() {
    return "Account{" +
        "owner='" + owner + '\'' +
        ", balance=" + balance +
        ", overdraftFrame=" + overdraftFrame +
        '}';
  }

}
