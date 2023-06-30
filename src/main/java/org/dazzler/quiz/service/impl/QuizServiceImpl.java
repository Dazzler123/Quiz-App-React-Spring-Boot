/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 30-Jun-2023
 * Time : 8:39 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.service.impl;

import org.dazzler.quiz.entity.Question;
import org.dazzler.quiz.entity.Quiz;
import org.dazzler.quiz.repo.QuestionRepo;
import org.dazzler.quiz.repo.QuizRepo;
import org.dazzler.quiz.service.QuizService;
import org.dazzler.quiz.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    QuizRepo quizRepo;

    @Autowired
    QuestionRepo questionRepo;

    @Override
    public boolean createNewQuiz(String technology, int questionCount, String title) {
        List<Question> questionList = questionRepo.findRandomQuestionsOfTechnology(technology, questionCount);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionList(questionList);
        quizRepo.save(quiz);
        return true;
    }
}
