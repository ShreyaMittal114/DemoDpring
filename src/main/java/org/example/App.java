package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class    App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "spring.xml" );
       Alien obj= (Alien) context.getBean("alien");

//        Alien obj2= (Alien) context.getBean("alien1");
//      obj.setAge(18);
//       System.out.println(obj.getAge());
//        System.out.println(obj2.getAge());//but we want spring to do it inject(xml file)
       obj.build();


    }
}
