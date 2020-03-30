package org.launchcode.RedBike.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* written by Elizabeth Ernst*/
@Controller
public class HelloWorld {

    //handles  request at / hello
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
       return  "Hello World!";
    }


}
