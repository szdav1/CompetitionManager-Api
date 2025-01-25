package com._2p1team.cmapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/*
 * Read - Egy lekerdezes
 *
 * List - Osszes/Tobb lekerdezes
 * Save - Mentes
 * */
@Entity
@Table(name = "Competitor")
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String club;
    private LocalDate birthDate;

    public Competitor() {
    }

    public Competitor(String name, String club, LocalDate birthDate) {
        this.name = name;
        this.club = club;
        this.birthDate = birthDate;
    }

    public Competitor(Long id, String name, String club, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.club = club;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}