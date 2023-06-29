package org.dazzler.quiz.service;

import org.dazzler.quiz.dto.QuestionDTO;

import java.util.ArrayList;
import java.util.List;

public interface QuestionService {
    ArrayList<QuestionDTO> loadAllQuestion();

    List<QuestionDTO> getQuestionByTechnology(String technology);

    boolean saveQuestion(QuestionDTO questionDTO);
}
