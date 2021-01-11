package io.pragra.learning.springlearning1;



import io.pragra.learning.springlearning1.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {


    //Person person = new Person("subash",25,new);
//    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    Person person = context.getBean("person",Person.class);
//        System.out.println(person);
//        System.out.println(person.getAddress());
//        ((ClassPathXmlApplicationContext) context).close();

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person person = context.getBean("person",Person.class);
//        System.out.println(person);
//        ((AnnotationConfigApplicationContext) context).close();

//        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.springlearning1.config");
//        Person person = context.getBean(Person.class);
//        OfficeAddress officeAddress = context.getBean(OfficeAddress.class);
//        System.out.println(person);
//        System.out.println(officeAddress);

        ApplicationContext context = SpringApplication.run(App.class,args);
        System.out.println(context.getBean("person2",Person.class));
    }}
