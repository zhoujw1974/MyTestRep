package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloTest {

public static void main(String[] args)
{
    System.out.println("Hello, world !!!");
    com.test.MyDog myDog = new com.test.MyDog();
    myDog.setName("My Dog Love");
    System.out.println(myDog.getName());
    Date date = new Date();
    SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
    System.out.println("Today is " + dateFormat.format(date));

}
}