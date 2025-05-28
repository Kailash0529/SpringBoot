package org.example;

import jakarta.persistence.*;

@Entity
public class Laptop {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;  // Unique identifier for Laptop

    private String model;
    private String ram;

    private String Storage;

    @ManyToOne
    @JoinColumn(name = "sid")  // Foreign key column
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", model='" + model + '\'' +
                ", Storage='" + Storage + '\'' +
                '}';
    }
}
