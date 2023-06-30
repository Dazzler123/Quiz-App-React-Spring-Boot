/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 30-Jun-2023
 * Time : 8:32 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    List<Question> questionList;
}
