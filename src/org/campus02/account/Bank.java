package org.campus02.account;

import java.util.HashMap;

public class Bank {

  private HashMap<String,Account> accounts = new HashMap<>();

  public void addAccount(String owner, double balance, double overdraftFrame)
        throws BankException {
    if(accounts.containsKey(owner)) {
      throw new BankException();
    }
    accounts.put(owner, new Account(owner,balance, overdraftFrame));
  }

  public void transfer(String fromOwner, String toOwner, double amount)
    throws AccountNotFoundException, BankException {

    if(!accounts.containsKey(fromOwner) ||
        !accounts.containsKey(toOwner) ) {
      throw new AccountNotFoundException();
    }

    Account from = accounts.get(fromOwner);
    Account to = accounts.get(toOwner);

    try {
      from.debit(amount);
      to.credit(amount);
    } catch (NotEnoughMoneyException e) {
      throw new BankException("transfer not possible",e);
    }
  }

  @Override
  public String toString() {
    return "Bank{" +
        "accounts=" + accounts +
        '}';
  }
}
