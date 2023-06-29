/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 28-Jun-2023
 * Time : 12:38 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.service.impl;

import org.dazzler.quiz.dto.QuestionDTO;
import org.dazzler.quiz.entity.Question;
import org.dazzler.quiz.repo.QuestionRepo;
import org.dazzler.quiz.service.QuestionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    QuestionRepo repo;

    @Override
    public ResponseEntity<ArrayList<QuestionDTO>> loadAllQuestion() {
        return new ResponseEntity<>(mapper.map(repo.findAll(), new TypeToken<ArrayList<QuestionDTO>>() {
        }.getType()), HttpStatus.OK);
    }

    @Override
    public List<QuestionDTO> getQuestionByTechnology(String technology) {
        return mapper.map(repo.findAllByTechnology(technology), new TypeToken<ArrayList<QuestionDTO>>() {
        }.getType());
    }

    @Override
    public boolean saveQuestion(QuestionDTO questionDTO) {
        repo.save(mapper.map(questionDTO, Question.class));
        return true;
    }
}
