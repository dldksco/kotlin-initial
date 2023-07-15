package com.initial.lec03;



public class Lec03Main {

  public static void main(String[] args) {
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof com.lannstark.lec03.Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

}
