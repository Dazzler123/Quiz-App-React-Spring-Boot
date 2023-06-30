package org.dazzler.quiz.repo;

import org.dazzler.quiz.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, String> {
    List<Question> findAllByTechnology(String technology);

    @Query(value = "SELECT * FROM question q where q.technology=:technology ORDER BY RAND() LIMIT :count",
            nativeQuery = true)
    List<Question> findRandomQuestionsOfTechnology(String technology, int count);
}
