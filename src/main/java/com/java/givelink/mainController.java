package com.java.givelink;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/main") public String main(Model model){
        System.out.println("main");
        return "index";
    }
}
