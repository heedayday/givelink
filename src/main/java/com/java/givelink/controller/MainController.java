package com.java.givelink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("name", "Givelink");
        return "index"; // templates/home.html 파일 보여줌
    }

    @GetMapping("/post")
    public String post(Model model) {
        model.addAttribute("name", "Givelink");
        return "post"; // templates/home.html 파일 보여줌
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Givelink");
        return "about"; // templates/home.html 파일 보여줌
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("name", "Givelink");
        return "contact"; // templates/home.html 파일 보여줌
    }

}
