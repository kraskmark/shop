package com.example.demo.model;

import java.util.Objects;

public class Consumer {
    private String lastName;
    private String firsName;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "lastName='" + lastName + '\'' +
                ", firsName='" + firsName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return Objects.equals(lastName, consumer.lastName) && Objects.equals(firsName, consumer.firsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firsName);
    }
}
