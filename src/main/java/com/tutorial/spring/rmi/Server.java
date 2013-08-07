package com.tutorial.spring.rmi;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("server-context.xml");
    }
}
