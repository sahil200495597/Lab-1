package com.example.personapp;

public class Person {

    private String name;
    private int age;

    private  int phone;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(" \n Name: %s \n Age: %d \n Phone: %s \nAddress: %s" ,
                name, age, phone, address);
    }
}
