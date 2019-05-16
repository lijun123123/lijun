package com.my.springboot6.controller;
import java.util.Map;

import org.omg.CORBA.Object;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LiController {
       @RequestMapping("/user")
       public String hello() {
    	  
    	   return "lijun";
       }
}
