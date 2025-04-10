package com._2p1team.cmapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="Admins")
public class Admins {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public Admins() {
    }

    public Admins(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Admins(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
            ", username='"+username+'\''+
            ", password='"+password+'\''+
            '}';
    }

}