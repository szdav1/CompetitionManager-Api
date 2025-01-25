package com._2p1team.cmapi.repository;

import com._2p1team.cmapi.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}