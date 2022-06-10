package com.simpleSpringAPI.firstSpringAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student aleksa = new Student(
                    "Aleksa",
                    "something@lala.com",
                    LocalDate.of(1999, DECEMBER, 25)
            );

            Student neko = new Student(
                    "Neko",
                    "neko@lala.com",
                    LocalDate.of(1929, JANUARY, 16)
            );

            repository.saveAll(
                    List.of(aleksa, neko)
            );
        };
    }
}
