package com.wangjiangfei.springbootmybatis;

import com.wangjiangfei.springbootmybatis.dao.StudentScoreDao;
import com.wangjiangfei.springbootmybatis.pojo.StudentScore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootmybatisApplicationTests {
    @Resource
    StudentScoreDao studentScoreDao;
    @Test
    void getById() {
        System.out.println(studentScoreDao.getById(2));
    }

    @Test
    void getAll(){
        System.out.println(studentScoreDao.getAll());
    }

    @Test
    void getBy(){
        StudentScore studentScore = new StudentScore();
        studentScore.setBeginIndex(1);
        studentScore.setPageSize(3);
        System.out.println(studentScoreDao.getBy(studentScore));
    }

    @Test
    void insertOne(){
        StudentScore studentScore = new StudentScore();
        studentScore.setScore_name("这是个测试。。。");
        System.out.println(studentScoreDao.insertOne(studentScore));
        System.out.println(studentScoreDao.getById(studentScore.getId()));
    }

    @Test
    void insertBatch(){
        StudentScore studentScore = new StudentScore();
        studentScore.setScore_name("批量插入111");
        StudentScore studentScore2 = new StudentScore();
        studentScore2.setScore_name("批量插入222");
        StudentScore studentScore3 = new StudentScore();
        studentScore3.setScore_name("批量插入333");
        List<StudentScore> list = new ArrayList<>();
        list.add(studentScore);
        list.add(studentScore2);
        list.add(studentScore3);
        System.out.println(studentScoreDao.insertBatch(list));
        System.out.println(studentScoreDao.getAll());
    }

    @Test
    void updataBatch(){
        StudentScore studentScore = new StudentScore();
        studentScore.setId(11);
        studentScore.setScore_name("已修改111");
        StudentScore studentScore2 = new StudentScore();
        studentScore2.setId(12);
        studentScore2.setScore_name("已修改111");
        StudentScore studentScore3 = new StudentScore();
        studentScore3.setId(13);
        studentScore3.setScore_name("已修改111");
        List<StudentScore> list = new ArrayList<>();
        list.add(studentScore);
        list.add(studentScore2);
        list.add(studentScore3);
        System.out.println(studentScoreDao.updataBatch(list));
        System.out.println(studentScoreDao.getAll());
    }
}
