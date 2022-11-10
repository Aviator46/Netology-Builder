package ru.netology;

import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age == null ? OptionalInt.empty() : OptionalInt.of(age);
    }

    public String getCity() {
        return city;
    }

    public void setAddress() {
        this.city = city;
    }

    public void happyToBirthday() {
        if (age > -1 && age < 120) {
            age ++;
        }
    }

    @Override
    public String toString() {
        return ("Имя - " + name + " " +
                "Фамилия - " + surname + " " +
                "Возраст - " + (age == null ? "неизвестен" : age) + " " +
                "Город - " + city);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.surname(this.getSurname())
                .age(0)
                .city(this.getCity());
        return child;
    }
}
