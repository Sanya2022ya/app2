package ru.kors.springsecurityexample.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String password;
    private String roles;

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getRoles() {
        return roles;
    }

    public void setPassword(String encode) {
        password = encode;
    }
}
