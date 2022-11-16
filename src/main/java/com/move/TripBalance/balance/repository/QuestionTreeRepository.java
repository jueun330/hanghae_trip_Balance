package com.move.TripBalance.balance.repository;

import com.move.TripBalance.balance.QuestionTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionTreeRepository extends JpaRepository<QuestionTree, Long> {


}
