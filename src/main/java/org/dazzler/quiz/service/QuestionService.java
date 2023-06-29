package org.dazzler.quiz.service;

import org.dazzler.quiz.dto.QuestionDTO;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface QuestionService {
    ResponseEntity<ArrayList<QuestionDTO>> loadAllQuestion();

    List<QuestionDTO> getQuestionByTechnology(String technology);

    boolean saveQuestion(QuestionDTO questionDTO);
}
