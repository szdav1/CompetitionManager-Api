package com._2p1team.cmapi.service;

import com._2p1team.cmapi.converter.AdminsConverter;
import com._2p1team.cmapi.dto.AdminsList;
import com._2p1team.cmapi.dto.AdminsSave;
import com._2p1team.cmapi.exceptions.UsernameAlreadyTakeException;
import com._2p1team.cmapi.model.Admins;
import com._2p1team.cmapi.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsService {

    private AdminsRepository repository;

    @Autowired
    public AdminsService(AdminsRepository repository) {
        this.repository = repository;
    }

    public List<AdminsList> findAll() {
        return AdminsConverter.convertModelsToList(repository.findAll());
    }

    public Admins saveNewAdmin(AdminsSave adminsSave) {
        List<AdminsList> admins = this.findAll();

        admins.forEach(admin -> {
            if (admin.username().equalsIgnoreCase(adminsSave.username()))
                throw new UsernameAlreadyTakeException("Username already taken");
        });

        return this.repository.save(AdminsConverter.convertSaveToModel(adminsSave));
    }

}