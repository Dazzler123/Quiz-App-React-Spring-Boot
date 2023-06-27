/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 27-Jun-2023
 * Time : 8:56 PM
 * Project Name : Quiz-App-Spring-Boot
 */
package org.dazzler.quiz;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebAppInitializer {
    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
