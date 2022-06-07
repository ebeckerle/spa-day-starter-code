package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class User {

    @NotBlank(message = "this field can not be blank")
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @Size(min = 6)
    @NotBlank(message = "this field can not be blank")
    private String password;

    @NotBlank(message = "this field can not be blank")
    private String verify;

    private Integer id;
    private static Integer nextId = 1;
    private LocalDate dateJoined;

    public User() {

    }
    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = nextId;
        nextId++;
        this.dateJoined = LocalDate.now();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }




}
