/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 29-Jun-2023
 * Time : 2:57 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz.advicer;

import org.dazzler.quiz.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handlerException(RuntimeException e) {
        return new ResponseUtil("500", e.getMessage(), null);
    }
}
