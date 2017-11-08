package com.jpa2chapters.ch2gettingstarted;
// @Entity: annotation that indicates the persistence engine that the class is an entity
// @Id: annotation that annotates the particular property or field that holds the persistent identity of the entity (pK)

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private double length;

    public Customer() { }

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
