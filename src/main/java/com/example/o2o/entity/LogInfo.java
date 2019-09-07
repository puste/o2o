package com.example.o2o.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class LogInfo {
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;
    private  String loginname;
    private  String loginip;
    private Date logintime;
}
