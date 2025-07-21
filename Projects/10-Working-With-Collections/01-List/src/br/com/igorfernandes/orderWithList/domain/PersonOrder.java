package br.com.igorfernandes.orderWithList.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonOrder {
    List<Person> listPerson;

    public PersonOrder() {
        listPerson = new ArrayList<>();
    }

    public void addPerson(String name, int age, float height) {
        listPerson.add(new Person(name, age, height));
    }

    public void orderByAge() {
        listPerson = listPerson.stream().sorted().toList();
    }

    public void orderByHeight() {
        // using class
        listPerson = listPerson.stream().sorted(new HeightComparator()).toList();
        // using lambda
        listPerson = listPerson.stream()
                .sorted((p1, p2) -> Float.compare(p1.getHeight(), p2.getHeight()))
                .toList();
    }

    @Override
    public String toString() {
        return "PersonOrder{" +
                "listPerson=" + listPerson +
                '}';
    }

    public static void main(String[] args) {
        PersonOrder personOrder = new PersonOrder();
        personOrder.addPerson("Jhon", 18, 1.75f);
        personOrder.addPerson("Igor", 26, 1.80f);
        personOrder.addPerson("Maria", 17, 1.55f);
        personOrder.addPerson("Joana", 25, 1.65f);
        System.out.println(personOrder);
        personOrder.orderByAge();
        System.out.println(personOrder);
        personOrder.orderByHeight();
        System.out.println(personOrder);
    }
}
