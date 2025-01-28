package com._2p1team.cmapi.service;

import com._2p1team.cmapi.converter.CompetitionConverter;
import com._2p1team.cmapi.dto.CompetitionList;
import com._2p1team.cmapi.dto.CompetitionRead;
import com._2p1team.cmapi.dto.CompetitionSave;
import com._2p1team.cmapi.exceptions.CompetitionNotFoundByIdException;
import com._2p1team.cmapi.model.Competition;
import com._2p1team.cmapi.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

    private final CompetitionRepository repository;

    @Autowired
    public CompetitionService(final CompetitionRepository repository) {
        this.repository = repository;
    }

    public List<CompetitionList> findAll() {
        return CompetitionConverter.convertModelsToList(repository.findAll());
    }

    public CompetitionRead findCompetitionById(final long id) {
        Competition competition = repository.findById(id)
            .orElseThrow(() -> new CompetitionNotFoundByIdException(String.format("Competition with '%d' id not found", id)));

        return CompetitionConverter.convertModelToRead(competition);
    }

    public CompetitionRead saveNewCompetition(final CompetitionSave competitionSave) {
        Competition competition = this.repository.save(CompetitionConverter.convertSaveToModel(competitionSave));

        return CompetitionConverter.convertModelToRead(competition);
    }

    public CompetitionRead updateCompetition(final Long id, final CompetitionSave competitionSave) {
        Competition competition = repository.findById(id)
            .orElseThrow(() -> new CompetitionNotFoundByIdException(String.format("Competition with '%d' id not found", id)));

        competition.setName(competitionSave.name());
        competition.setLocation(competitionSave.location());
        competition.setDate(competitionSave.date());

        this.repository.save(competition);

        return CompetitionConverter.convertModelToRead(competition);
    }

}