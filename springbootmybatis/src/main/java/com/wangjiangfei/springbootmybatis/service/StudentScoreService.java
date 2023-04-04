package com.wangjiangfei.springbootmybatis.service;

import com.wangjiangfei.springbootmybatis.dao.StudentScoreDao;
import com.wangjiangfei.springbootmybatis.pojo.StudentScore;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentScoreService {
    @Resource
    StudentScoreDao studentScoreDao;

    public StudentScore getById(int id){
        return studentScoreDao.getById(id);
    }

    public List<StudentScore> getAll(){
        return studentScoreDao.getAll();
    }

    public List<StudentScore> getBy(StudentScore studentScore){
        return studentScoreDao.getBy(studentScore);
    }

    public boolean insertOne(StudentScore studentScore){
        return studentScoreDao.insertOne(studentScore) > 0;
    }

    public boolean insertBatch(List<StudentScore> list){
        return studentScoreDao.insertBatch(list) > 0;
    }

    public boolean updataBatch(List<StudentScore> list) {
        return studentScoreDao.updataBatch(list) > 0;
    }

    public boolean deleteBatch(List<StudentScore> list){
        return studentScoreDao.deleteBatch(list) > 0;
    }
}
