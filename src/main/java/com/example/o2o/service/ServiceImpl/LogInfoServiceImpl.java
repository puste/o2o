package com.example.o2o.service.ServiceImpl;

import com.example.o2o.entity.LogInfo;
import com.example.o2o.mapper.LogInfoMapper;
import com.example.o2o.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LogInfoServiceImpl implements LogInfoService {

    @Autowired
    private LogInfoMapper logInfoMapper;

    @Override
    public int addLogInfo(LogInfo logInfo) {
        return logInfoMapper.insert(logInfo);
    }
}
