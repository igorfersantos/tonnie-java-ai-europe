package br.com.igorfernandes.orderWithList.domain;

import java.util.Comparator;
import java.util.Formatter;
import java.util.logging.SimpleFormatter;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + new Formatter().format("%.2f",height) +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }
}

class HeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Float.compare(person1.getHeight(), person2.getHeight());
    }
}
