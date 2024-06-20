package info;

import java.time.LocalDate;

public class Patient {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private String address;
    private String phone;
    private String email;

    public Patient(int id, String name, LocalDate dateOfBirth, String gender, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Patient(String name, LocalDate dateOfBirth, String gender, String address, String phone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

