package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .name("Анна")
                .surname("Вольф")
                .age(31)
                .city("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .name("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try { //нет имени
            Person gta4 = new PersonBuilder()
                    .surname("Беллик")
                    .city("Либерти-Сити")
                    .age(35)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try { //нет фамилии
            Person gtaSA = new PersonBuilder()
                    .name("Томми")
                    .city("Вайс-Сити")
                    .age(30)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try { //некорректный возраст
            Person gtaVC = new PersonBuilder()
                    .name("Карл")
                    .surname("Джонсон")
                    .city("Лос-Сантос")
                    .age(-10)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}