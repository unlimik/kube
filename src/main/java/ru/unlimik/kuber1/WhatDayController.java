package ru.unlimik.kuber1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class WhatDayController {
    @RequestMapping("/time")
    @ResponseBody
    String hello()
    {
        Date seychas = new Date();
        return seychas.toLocaleString();
    }
}
