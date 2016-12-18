package me.jeffrey;

import me.jeffrey.collection.RevokeJavaCollections;
import me.jeffrey.entity.Person;
import me.jeffrey.exception.ScalaThrower;
import me.jeffrey.generic.Student;

/**
 * Created by Jeffrey on 2016/12/18.
 */
public class MainJava {

    public static void main(String[] args) {
        System.out.println("hello world! Java!");

        //invoke scala method
        MySacla scala = new MySacla();
        scala.sayHello("scala testing");

        //list
        RevokeJavaCollections collections = new RevokeJavaCollections();
        for (String tmp : collections.getList()) {
            System.out.println(tmp);
        }

        //invoke scala entity
        Person p = new Person("jeff", 30);
        System.out.println("name=" + p.name() + " age=" + p.age());
        System.out.println(Person.getIdentityNo());

        //Generic
        Student<String, Integer> student = new Student<String, Integer>("Lee", 18);
        //scala
        System.out.println(student.name());
        //java
        System.out.println(student.getName());

        //exception
        ScalaThrower st = new ScalaThrower();
        try {
            st.exceptionThrower();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
