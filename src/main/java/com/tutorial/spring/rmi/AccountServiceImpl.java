package com.tutorial.spring.rmi;

import java.util.List;

public class AccountServiceImpl implements AccountService {

  public void insertAccount(Account acc) {
    System.out.println("insertAccount invoked");
  }
  
  public List getAccounts(String name) {
      System.out.println("getAccounts invoked");
    return null;
  }
}