/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 30-Jun-2023
 * Time : 8:39 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.service.impl;

import org.dazzler.quiz.repo.QuizRepo;
import org.dazzler.quiz.service.QuizService;
import org.dazzler.quiz.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    QuizRepo quizRepo;

    @Override
    public ResponseUtil createNewQuiz(String technology, int questionCount, String title) {
        return null;
    }
}
