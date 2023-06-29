/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 29-Jun-2023
 * Time : 2:59 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private String code;
    private String message;
    private Object data;
}
