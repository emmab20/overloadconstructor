package com.overloadconstructor;

/**
 * Overload Constructor
 *
 */
public class App {
    public static void main(String[] args) {
        PotentialEmployee candidate1 = new PotentialEmployee("Jack", "Smith", "jacksmith@email.com",
                "123-45-6789");
        PotentialEmployee candidate2 = new PotentialEmployee("robertsmith@email.com", "123-45-6789");
        PotentialEmployee candidate3 = new PotentialEmployee("peterparker@email.com");

        System.out.println(candidate1.getFirstName());
        System.out.println(candidate1.getLastName());
        System.out.println(candidate1.getEmail());
        System.out.println(candidate1.getSSN());

        System.out.println(candidate2.getFirstName());
        System.out.println(candidate2.getLastName());
        System.out.println(candidate2.getEmail());
        System.out.println(candidate2.getSSN());

        System.out.println(candidate3.getFirstName());
        System.out.println(candidate3.getLastName());
        System.out.println(candidate3.getEmail());
        System.out.println(candidate3.getSSN());
    }
}
