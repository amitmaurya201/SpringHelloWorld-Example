package com.amit.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {



ApplicationContext ac=new ClassPathXmlApplicationContext("spring_config.xml");
Object o=ac.getBean("h");
HelloWorld hh=(HelloWorld)o;
hh.helloMessage();
}
}
