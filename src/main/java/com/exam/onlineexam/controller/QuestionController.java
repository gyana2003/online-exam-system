package com.exam.onlineexam.controller;

import com.exam.onlineexam.model.Question;
import com.exam.onlineexam.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/questions/{difficulty}")
    public List<Question> getByDifficulty(@PathVariable String difficulty) {
        return questionRepository.findByDifficulty(difficulty);
    }

    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question q) {
        return questionRepository.save(q);
    }
}
