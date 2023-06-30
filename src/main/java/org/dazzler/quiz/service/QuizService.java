package org.dazzler.quiz.service;

import org.dazzler.quiz.util.ResponseUtil;

public interface QuizService {
    public boolean createNewQuiz(String technology, int questionCount, String title);
}
