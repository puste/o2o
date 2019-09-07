package com.example.o2o.controller;

import com.example.o2o.entity.Local_auth;
import com.example.o2o.entity.LogInfo;
import com.example.o2o.entity.Person_info;
import com.example.o2o.service.LocalAuthService;
import com.example.o2o.service.LogInfoService;
import com.example.o2o.service.PersonInfoService;
import com.example.o2o.utils.SysConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("shop")
public class LocalAuthController {
    @Autowired
    private LocalAuthService localAuthService;
    @Autowired
    private PersonInfoService personInfoService;
    @Autowired
    private LogInfoService logInfoService;
    @GetMapping("login.html")
    public String toLogin(){
        return "login";}

    @GetMapping("regist.html")
    public  String  toRegist(){
        return "regist";
    }

    @GetMapping("login")
    public String login(){
        return "index";
    }
//    @PostMapping("login")
//    public String login(Local_auth localAuth,HttpSession session){
//        Local_auth loginUser=localAuthService.login(localAuth);
//        if (loginUser!=null){
//            Person_info personInfo=new Person_info();
//            personInfo.setUserId(loginUser.getUserId());
//            personInfo= personInfoService.getPersonInfo(personInfo);
//            session.setAttribute(SysConstants.SESSION_USER,loginUser);
//            session.setAttribute(SysConstants.SESSION_PERSONINFO,personInfo);
//            LogInfo logInfo=new LogInfo();
//            logInfo.setLoginname(loginUser.getUserName()+"-"+personInfo.getName());
//            logInfo.setLoginip("");
//            logInfo.setLogintime(new Date());
//            logInfoService.addLogInfo(logInfo);
//            return "index";}else {
//            return "redirect:login.html";
//        }
//        }
    }