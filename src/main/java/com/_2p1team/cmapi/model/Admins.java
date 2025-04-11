package com._2p1team.cmapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="Admins")
public class Admins {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public Admins() {
    }

    public Admins(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Admins(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {
        this.email = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admins{"+
            "id="+id+
            ", email='"+email+'\''+
            ", password='"+password+'\''+
            '}';
    }

}