package ru.unlimik.kuber1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Kuber1Controoler {
    @RequestMapping("/")
    @ResponseBody
    String hello()
    {
        return "Hello! Hello! Hello! Hi! Moscow! London! New York! Ottava!";
    }
}
