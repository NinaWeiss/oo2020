package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebAppController {
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value="message",defaultValue ="World")String message,Model model){
        model.addAttribute("message","Hello " + message);
        return "hello";
    }
    

    @GetMapping("/login")
    public String xxx(@RequestParam(value="name",defaultValue =" ")int name,
                      @RequestParam(value="pw",defaultValue =" ")int pw,Model model){
        
        model.addAttribute("name",name);
        model.addAttribute("pw",pw);



        return "hello";

    }

}