package com.exam.onlineexam.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "QUESTION")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private String answer;

    // NEW FIELD (VERY IMPORTANT)
    private String difficulty;   // EASY / MEDIUM / HARD
}
