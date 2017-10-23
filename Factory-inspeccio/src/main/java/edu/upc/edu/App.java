package edu.upc.edu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

<<<<<<< HEAD
/**
 * Hello world!
 */
 
=======

>>>>>>> origin/master
public class App {
    public static void main(String[] args) {

        System.out.println("-----Metodes:");
        Class info = FactorySin.class;
        for (Method method : info.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        System.out.println("------ Atributs:");

        for (Field method : info.getDeclaredFields()) {
            System.out.println(method.getName());
        }


        System.out.println("------ Constructors:");
        for (Constructor method : info.getConstructors())
        {
            System.out.println(method.getClass());
        }







    }
}
