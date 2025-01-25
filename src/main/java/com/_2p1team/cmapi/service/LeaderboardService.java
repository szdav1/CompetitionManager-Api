package com._2p1team.cmapi.service;

import com._2p1team.cmapi.converter.LeaderboardConverter;
import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {
    private final LeaderboardRepository repository;

    @Autowired
    public LeaderboardService(final LeaderboardRepository repository) {
        this.repository = repository;
    }

    public List<LeaderboardList> findAll() {
        return LeaderboardConverter.convertModelsToList(this.repository.findAll());
    }
}