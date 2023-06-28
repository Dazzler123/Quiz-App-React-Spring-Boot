/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 28-Jun-2023
 * Time : 1:23 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class QuestionDTO {
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
