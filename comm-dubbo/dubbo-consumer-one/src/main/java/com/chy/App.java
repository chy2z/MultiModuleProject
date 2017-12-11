package com.chy;

import com.chy.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ClassPathXmlApplicationContext context;

    public static void main( String[] args ) throws IOException
    {
        context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("dubbo客户端端读取数据开始...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                HelloService demoService = (HelloService) context.getBean("helloService");
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                while (true) {
                    try {
                        System.out.println(demoService.sayHello(format.format(new Date())));
                        Thread.sleep(2000);
                    }
                    catch (Exception ex){
                        System.out.println(ex.toString());
                    }
                }
            }
        }).start();
        System.out.println("dubbo客户端读取数据结束...");
        System.in.read();
    }
}