package com.wangjiangfei.springbootmybatis.dao;

import com.wangjiangfei.springbootmybatis.pojo.StudentScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface StudentScoreDao {
    public StudentScore getById(@PathParam("id") int id);

    public List<StudentScore> getAll();

    public List<StudentScore> getBy(StudentScore studentScore);

    public int insertOne(StudentScore studentScore);

    public int insertBatch(@Param("listBatch") List<StudentScore> list);

    public int deleteBatch(@Param("listBatch") List<StudentScore> list);

    public int updataBatch(@Param("listBatch") List<StudentScore> list);
}
