package com.move.TripBalance.repository;

import java.util.List;
import java.util.Optional;

import com.move.TripBalance.domain.Member;
import com.move.TripBalance.domain.ReComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReCommentRepository extends JpaRepository<ReComment, Long> {
    List<ReComment> findAllByCommentId(Long commentId);
    List<ReComment> findAllByMember(Member member);
    Optional<ReComment> findById(Long id);
    int countAllByCommentId(Long id);
}
