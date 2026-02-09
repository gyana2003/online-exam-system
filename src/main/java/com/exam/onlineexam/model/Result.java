package com.exam.onlineexam.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "RESULT")
@Data
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_EMAIL")
    private String studentEmail;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "PERCENTAGE")
    private Double percentage;

    @Column(name = "EXAM_DATE")
    private LocalDate examDate;
}
