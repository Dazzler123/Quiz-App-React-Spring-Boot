package org.dazzler.quiz.service;

import org.dazzler.quiz.dto.QuestionDTO;

import java.util.ArrayList;

public interface QuestionService {
    public ArrayList<QuestionDTO> loadAllQuestion();
}
