/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 27-Jun-2023
 * Time : 9:00 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.controller;

import org.dazzler.quiz.dto.QuestionDTO;
import org.dazzler.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/all")
    public List<QuestionDTO> getAllQuestions(){
        return questionService.loadAllQuestion();
    }

    @GetMapping("technology/{technology}")
    public List<QuestionDTO> getQuestionByTechnology(@PathVariable String technology){
        return questionService.getQuestionByTechnology(technology);
    }
}
