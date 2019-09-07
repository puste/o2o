package com.example.o2o.service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.o2o.entity.Local_auth;
import com.example.o2o.mapper.LocalAuthMapper;
import com.example.o2o.mapper.PersonInfoMapper;
import com.example.o2o.service.LocalAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
public class LocalAuthServiceImpl implements LocalAuthService {
    @Autowired
    private LocalAuthMapper localAuthMapper;

    @Autowired
    private PersonInfoMapper personInfoMapper;
    @Override
    public Local_auth login(Local_auth localAuth) {
        QueryWrapper<Local_auth>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name",localAuth.getUserName());
        String password=localAuth.getPassword();
        String newPwd = DigestUtils.md5DigestAsHex(password.getBytes());
        queryWrapper.eq("password",newPwd);
        return localAuthMapper.selectOne(queryWrapper);
    }

    @Override
    public Local_auth getUserById(String userName) {
            QueryWrapper<Local_auth> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("user_name",userName);
            return localAuthMapper.selectOne(queryWrapper);
        }
    }
