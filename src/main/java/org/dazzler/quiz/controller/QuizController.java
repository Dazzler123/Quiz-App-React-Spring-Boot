/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 29-Jun-2023
 * Time : 8:39 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.controller;

import org.dazzler.quiz.util.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @PostMapping("create")
    public ResponseUtil createNewQuiz(@RequestParam String technology, @RequestParam int questionCount, @RequestParam String title){
        return new ResponseUtil("200","Method Called.",title);
    }
}
