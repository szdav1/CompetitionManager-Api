package com._2p1team.cmapi.service;

import com._2p1team.cmapi.converter.CompetitorConverter;
import com._2p1team.cmapi.dto.CompetitorList;
import com._2p1team.cmapi.dto.CompetitorRead;
import com._2p1team.cmapi.dto.CompetitorSave;
import com._2p1team.cmapi.exceptions.CompetitorNotFoundByIdException;
import com._2p1team.cmapi.model.Competitor;
import com._2p1team.cmapi.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitorService {
    private final CompetitorRepository repository;

    @Autowired
    public CompetitorService(final CompetitorRepository repository) {
        this.repository = repository;
    }

    public List<CompetitorList> findAll() {
        return CompetitorConverter.convertModelsToList(this.repository.findAll());
    }

    public CompetitorRead findCompetitorById(final Long id) {
        Competitor competitor = this.repository.findById(id)
            .orElseThrow(() -> new CompetitorNotFoundByIdException(String.format("Competitor with '%s' id not found", id)));

        return CompetitorConverter.convertModelToRead(competitor);
    }

    public CompetitorRead saveNewCompetitor(final CompetitorSave competitorSave) {
        Competitor competitor = this.repository.save(CompetitorConverter.convertSaveToModel(competitorSave));
        return CompetitorConverter.convertModelToRead(competitor);
    }

    public CompetitorRead updateCompetitor(final Long id, final CompetitorSave competitorSave) {
        Competitor competitor = this.repository.findById(id)
            .orElseThrow(() -> new CompetitorNotFoundByIdException(String.format("Competitor with '%s' id not found", id)));

        competitor.setName(competitorSave.name());
        competitor.setClub(competitorSave.club());
        competitor.setBirthDate(competitorSave.birthDate());

        this.repository.save(competitor);

        return CompetitorConverter.convertModelToRead(competitor);
    }

    public void deleteCompetitor(final Long id) {
        if (!this.repository.existsById(id))
            throw new CompetitorNotFoundByIdException(String.format("Competitor with '%s' id not found", id));

        this.repository.deleteById(id);
    }
}