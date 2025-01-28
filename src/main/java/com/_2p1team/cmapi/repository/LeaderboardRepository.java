package com._2p1team.cmapi.repository;

import com._2p1team.cmapi.model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {

}