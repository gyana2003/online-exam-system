package com.exam.onlineexam.controller;

import com.exam.onlineexam.model.Result;
import com.exam.onlineexam.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ResultController {

    @Autowired
    private ResultRepository resultRepository;

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody Result result) {

        double percentage = ((double) result.getScore() / result.getTotal()) * 100;
        result.setPercentage(percentage);
        result.setExamDate(LocalDate.now());

        return resultRepository.save(result);
    }

    @GetMapping("/leaderboard")
    public List<Result> getLeaderboard() {
        return resultRepository.findAllByOrderByScoreDesc();
    }
}
