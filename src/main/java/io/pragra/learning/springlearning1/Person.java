package io.pragra.learning.springlearning1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private Iaddress address;
    private List<String> hobbies;

    public Person(String name, int age, Iaddress address,List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Iaddress getAddress() {
        return address;
    }

    public void setAddress(Iaddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", hobbies=" + hobbies +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("**********INIT*************");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("************Destroy*********");
    }
}
