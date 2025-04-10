package com._2p1team.cmapi.dto;

public record AdminsList(
    Long id,
    String username,
    String password
) {

    public AdminsList() {
        this(0L, "", "");
    }

}