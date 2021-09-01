package com.company.homework_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTester {

  public static void main(String[] args) {
    Field[] fields = ReflectionPractice.class.getDeclaredFields();
    Method[] methods = ReflectionPractice.class.getDeclaredMethods();
    Field[] fields2 = ReflectionPractice.class.getFields();
    Method[] methods2 = ReflectionPractice.class.getMethods();
    System.out.println("Declared Fields inside ReflectionPractice class\n");
    for(Field f : fields){
      System.out.println(f.getName());

    }
    System.out.println("Declared Methods inside ReflectionPractice class\n");
    for(Method m:methods){
      System.out.println(m.getName());
    }

    System.out.println("Fields inside ReflectionPractice class with getFields \n");
    for(Field f : fields2){
      System.out.println(f.getName());

    }
    System.out.println("Methods inside ReflectionPractice class with getMethods\n");
    for(Method m:methods2){
      System.out.println(m.getName());
    }

  }
}
