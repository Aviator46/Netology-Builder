package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String city;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Нет имени!");
        }
        if (surname == null) {
            throw new IllegalStateException("Нет фамилии!");
        }
        if (age != null && age < 0) {
            throw new IllegalStateException("Некорректный возраст!");
        }
        return new Person(name, surname, age, city);
    }
}
