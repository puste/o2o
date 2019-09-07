package com.example.o2o.service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.o2o.entity.Person_info;
import com.example.o2o.mapper.PersonInfoMapper;
import com.example.o2o.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonInfoServiceImpl implements PersonInfoService {
    @Autowired
    private PersonInfoMapper personInfoMapper;

    @Override
    public Person_info getPersonInfo(Person_info personInfo) {
        QueryWrapper<Person_info> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",personInfo.getUserId());

        return personInfoMapper.selectOne(queryWrapper);
    }
}
