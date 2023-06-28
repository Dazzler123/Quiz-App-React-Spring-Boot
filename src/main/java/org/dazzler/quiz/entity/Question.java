/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 28-Jun-2023
 * Time : 1:08 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String questionText;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String answer;
    private String difficultyLevel;
    private String technology;
}
