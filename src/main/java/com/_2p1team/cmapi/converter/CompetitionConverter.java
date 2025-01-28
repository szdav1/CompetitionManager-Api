package com._2p1team.cmapi.converter;

import com._2p1team.cmapi.dto.CompetitionList;
import com._2p1team.cmapi.dto.CompetitionRead;
import com._2p1team.cmapi.dto.CompetitionSave;
import com._2p1team.cmapi.model.Competition;

import java.util.ArrayList;
import java.util.List;

public class CompetitionConverter {

    public static List<CompetitionList> convertModelsToList(final List<Competition> competitions) {
        List<CompetitionList> list = new ArrayList<>();
        competitions.forEach(competition -> list.add(new CompetitionList(competition.getId(), competition.getName(), competition.getLocation(), competition.getDate())));

        return list;
    }

    public static CompetitionRead convertModelToRead(final Competition competition) {
        return new CompetitionRead(competition.getId(), competition.getName(), competition.getLocation(), competition.getDate());
    }

    public static Competition convertSaveToModel(final CompetitionSave competitionSave) {
        return new Competition(competitionSave.name(), competitionSave.location(), competitionSave.date());
    }

}