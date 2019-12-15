package pl.itacademy.lesson18homework;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Sex some_enum;
    private int salary;
    private Address address;

    public Person(String firstName, String lastName, LocalDate birthDay, int salary, Address address, Sex some_enum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.salary = salary;
        this.address = address;
        this.some_enum = some_enum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public Sex getSome_enum() {
        return some_enum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDay, person.birthDay) &&
                Objects.equals(address, person.address) &&
                some_enum == person.some_enum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDay, salary, address, some_enum);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", address=" + address +
                ", some_enum=" + some_enum +
                '}';
    }
}
