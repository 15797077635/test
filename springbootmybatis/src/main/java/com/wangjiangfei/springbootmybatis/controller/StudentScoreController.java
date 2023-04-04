package com.wangjiangfei.springbootmybatis.controller;

import com.wangjiangfei.springbootmybatis.pojo.StudentScore;
import com.wangjiangfei.springbootmybatis.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/studentScores")
public class StudentScoreController {
    @Autowired
    StudentScoreService studentScoreService;

    @GetMapping("getById")
    @Transactional
    public StudentScore getById(@RequestParam("idd") int id) {
        return studentScoreService.getById(id);
    }

    @GetMapping("getAll")
    public List<StudentScore> getAll() {
        return studentScoreService.getAll();
    }

    @RequestMapping(value = "/getBy",method = RequestMethod.GET)
    public List<StudentScore> getBy(@RequestBody StudentScore studentScore) {
        return studentScoreService.getBy(studentScore);
    }

    @PostMapping("/insertOne")
    public boolean insertOne(@RequestBody StudentScore studentScore) {
        return studentScoreService.insertOne(studentScore);
    }

    @PostMapping("/insertBatch")
    public boolean insertBatch(@RequestBody List<StudentScore> list) {
        return studentScoreService.insertBatch(list);
    }

    @PutMapping("/updataBatch")
    public boolean updataBatch(@RequestBody List<StudentScore> list) {
        return studentScoreService.updataBatch(list);
    }

    @DeleteMapping("/deleteBatch")
    public boolean deleteBatch(@RequestBody List<StudentScore> list){
        return studentScoreService.deleteBatch(list);
    }
}
