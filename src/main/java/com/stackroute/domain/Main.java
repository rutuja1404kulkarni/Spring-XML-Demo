package com.stackroute.domain;


import com.stackroute.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("propertybeans.xml");
//        Movie movie=(Movie)applicationContext1.getBean("movie");
//        System.out.println(movie.toString());
//
//        ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("propertybeans.xml");
//        Actor actor=(Actor)applicationContext2.getBean("actor");
//        actor.getAge();
//        System.out.println(actor.toString());

        ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("constructorbean.xml");
//        Movie movie1=(Movie)applicationContext3.getBean("movie1");
//        Actor actor1=(Actor)applicationContext3.getBean("actor1");
        //System.out.println(movie1.toString());

        Movie movie3=(Movie)applicationContext3.getBean("movie4");
//        Actor actor3=(Actor)applicationContext3.getBean("Actor");
        System.out.println(movie3.toString());


    }
}
