package org.campus02.account;

public class BankingDemo {

  public static void main(String[] args) {

    Bank bank = new Bank();

    try {
      bank.addAccount("susi",500,500);
      bank.addAccount("max",3000,1000);

      System.out.println(bank);

      bank.transfer("susi","max",100);
      bank.transfer("max","susi",750);

      System.out.println(bank);


    } catch (BankException | AccountNotFoundException e) {
      e.printStackTrace();
    }

  }

}
