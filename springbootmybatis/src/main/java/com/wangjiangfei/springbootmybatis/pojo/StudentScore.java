package com.wangjiangfei.springbootmybatis.pojo;

import lombok.Data;

@Data
public class StudentScore {
    private int id;

    private String score_name;

    private int beginIndex;

    private int pageSize;
}
