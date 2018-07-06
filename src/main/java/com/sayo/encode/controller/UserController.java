package com.sayo.encode.controller;


import com.sayo.encode.paremater.SystemParams;
import com.sayo.encode.service.UserDetailsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping(value = "/dashboard")
    public ModelAndView dashboard(){

        logger.info("User Name : {}", SystemParams.getUserName());
        logger.info("User Password : {}", SystemParams.getPassword());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("users",userDetailsService.getUsers());
        modelAndView.setViewName("dashboard");

        return modelAndView;
    }
}
