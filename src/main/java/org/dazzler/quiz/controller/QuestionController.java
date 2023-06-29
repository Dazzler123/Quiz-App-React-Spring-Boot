/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 27-Jun-2023
 * Time : 9:00 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.controller;

import org.dazzler.quiz.dto.QuestionDTO;
import org.dazzler.quiz.service.QuestionService;
import org.dazzler.quiz.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/all")
    public ResponseUtil getAllQuestions() {
        return new ResponseUtil("200","All Questions Loaded.",questionService.loadAllQuestion());
    }

    @GetMapping("technology/{technology}")
    public ResponseUtil getQuestionByTechnology(@PathVariable String technology) {
        return new ResponseUtil("200","Questions filtered by technology loaded.",questionService.getQuestionByTechnology(technology));
    }

    @PostMapping("/add")
    public ResponseUtil addNewQuestion(@RequestBody QuestionDTO questionDTO) {
        return new ResponseUtil("201","New Question saved.",questionService.saveQuestion(questionDTO));
    }
}
