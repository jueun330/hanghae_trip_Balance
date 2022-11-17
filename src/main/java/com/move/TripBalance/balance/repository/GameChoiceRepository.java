package com.move.TripBalance.balance.repository;

import com.move.TripBalance.balance.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameChoiceRepository extends JpaRepository<GameResult, Long> {

}


