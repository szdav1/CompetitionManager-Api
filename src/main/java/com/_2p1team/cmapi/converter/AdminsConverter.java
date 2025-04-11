package com._2p1team.cmapi.converter;

import com._2p1team.cmapi.dto.AdminsList;
import com._2p1team.cmapi.dto.AdminsSave;
import com._2p1team.cmapi.model.Admins;

import java.util.ArrayList;
import java.util.List;

public class AdminsConverter {

    public static List<AdminsList> convertModelsToList(List<Admins> admins) {
        List<AdminsList> adminsLists = new ArrayList<>();

        admins.forEach(admin -> adminsLists.add(new AdminsList(admin.getId(), admin.getEmail(), admin.getPassword())));

        return adminsLists;
    }

    public static Admins convertSaveToModel(AdminsSave adminsSave) {
        return new Admins(adminsSave.email(), adminsSave.password());
    }

}