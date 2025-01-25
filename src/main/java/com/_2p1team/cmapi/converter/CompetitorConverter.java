package com._2p1team.cmapi.converter;

import com._2p1team.cmapi.dto.CompetitorList;
import com._2p1team.cmapi.dto.CompetitorRead;
import com._2p1team.cmapi.dto.CompetitorSave;
import com._2p1team.cmapi.model.Competitor;

import java.util.ArrayList;
import java.util.List;

public class CompetitorConverter {
    public static List<CompetitorList> convertModelsToList(final List<Competitor> competitors) {
        List<CompetitorList> list = new ArrayList<>();
        competitors.forEach(competitor -> list.add(new CompetitorList(competitor.getName(), competitor.getClub(), competitor.getBirthDate())));

        return list;
    }

    public static CompetitorRead convertModelToRead(final Competitor competitor) {
        return new CompetitorRead(competitor.getName(), competitor.getClub(), competitor.getBirthDate());
    }

    public static Competitor convertSaveToModel(final CompetitorSave competitorSave) {
        return new Competitor(competitorSave.name(), competitorSave.club(), competitorSave.birthDate());
    }
}