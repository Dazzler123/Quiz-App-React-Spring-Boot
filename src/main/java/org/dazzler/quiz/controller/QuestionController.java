/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 27-Jun-2023
 * Time : 9:00 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @GetMapping("/all")
    public String getAllQuestions(){
        return "All Questions loaded.";
    }
}
