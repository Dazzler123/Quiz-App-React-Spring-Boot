/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 28-Jun-2023
 * Time : 12:38 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.service.impl;

import org.dazzler.quiz.repo.QuestionRepo;
import org.dazzler.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepo questionRepo;
}
