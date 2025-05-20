package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> allPeople = new ArrayList<>();

        Person person1 = new Person("Lebron", "James",40);
        allPeople.add(person1);
        System.out.println(allPeople.size());
        Person person2 = new Person("Jeff", "Hardy", 40);
        allPeople.add(person2);
        Person person3 = new Person("Frank","Ocean", 37);
        allPeople.add(person3);
        Person person4 = new Person("Lucki", "Camel", 28);
        allPeople.add(person4);
        Person person5 = new Person("Symere", "Woods", 29);
        allPeople.add(person5);
        Person person6 = new Person("Barack", "Obama", 63);
        allPeople.add(person6);
        Person person7 = new Person("Rakim", "Meyers", 36);
        allPeople.add(person7);
        Person person8 = new Person("Pharrell", "Williams", 52);
        allPeople.add(person8);
        Person person9 = new Person("Jon", "Jones", 37);
        allPeople.add(person9);
        Person person10 = new Person("Charles", "Olivera", 35);
        allPeople.add(person10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for first or last name: ");
        String name = scanner.nextLine();


        for (Person allPerson : allPeople) {
            if (name.equalsIgnoreCase(allPerson.getFirstName()) || name.equalsIgnoreCase(allPerson.getLastName())) {
                System.out.println(allPerson.getFirstName() + " " + allPerson.getLastName());
            }
        }


    }

}
