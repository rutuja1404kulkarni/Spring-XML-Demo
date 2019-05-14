package com.stackroute;
import  org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */


public class Application
{

    public static void main( String[] args )
    {
//        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Application.class);
//        Application application=applicationContext.getBean(Application.class);
//        application.start();

//        Resource resource=new ClassPathResource("Spring.xml");
//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        HelloWorld beanC=(HelloWorld) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("helloWorld");

        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Message obj = (Message) context.getBean("message");
        obj.printing();
    }

}
