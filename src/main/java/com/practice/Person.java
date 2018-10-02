package com.practice;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String city;

    public Person(String name,int age,String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{"+"name=" + name + ", age=" + age + ", city=" + city + "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city);
    }
}
