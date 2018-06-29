package com.sayo.encode.controller;


import com.sayo.encode.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping(value = "/dashboard")
    public ModelAndView dashboard(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("users",userDetailsService.getUsers());
        modelAndView.setViewName("dashboard");

        return modelAndView;
    }
}
