package com.tutorial.spring.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("client-context.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.insertAccount(new Account());
    }
}
