package com.chy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("dubbo服务已经启动...");
        System.in.read();
    }
}
