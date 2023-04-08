package juint_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter age ");
        Integer age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("enter e-mail in correct formate");
        String email = scanner.nextLine();

        //loading constructor with values


        person.setEmail(email);

        //custom exception
        try {
            person.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        person.setName(name);

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
    }
}
package juint_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter age ");
        Integer age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("enter e-mail in correct formate");
        String email = scanner.nextLine();

        //loading constructor with values


        person.setEmail(email);

        //custom exception
        try {
            person.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


        person.setName(name);

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
    }
}
