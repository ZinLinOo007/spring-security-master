package com.example.springsecuritymaster.ds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "FirstName cannot be empty.")
    @Pattern(regexp = "[A-Za-z-']*", message = "First Name cannot contains illegal character.")
    private String firstName;


    @NotBlank(message = "LastName cannot be empty.")
    @Pattern(regexp = "[A-Za-z-']*", message = "Last Name cannot contains illegal character.")
    private String lastName;

    @NotBlank(message = "Phone Number cannot be empty.")
    @Pattern(regexp = "[0-9\\-+]*", message = "Phone Number cannot contains illegal character.")
    private String phoneNumber;

    @NotBlank(message = "Address cannot be empty.")
    @Pattern(regexp = "[\\w .\\-/,]*", message = "Address cannot contains illegal character.")
    private String address;

    @NotBlank(message = "Cubicle Number cannot be empty.")
    @Pattern(regexp = "[A-Za-z0-9\\-]*", message = "Cubicle Number cannot contains illegal character.")
    private String cubicleNo;

    public Employee() {
    }


    public Employee(String firstName, String lastName, String phoneNumber, String address, String cubicleNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cubicleNo = cubicleNo;
    }
}
