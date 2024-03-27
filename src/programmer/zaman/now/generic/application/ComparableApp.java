package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Budi", "Bandung"),
                new Person("Joko", "Jakarta"),
                new Person("Alvenio", "Semarang")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
