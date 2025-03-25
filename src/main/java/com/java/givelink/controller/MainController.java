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

    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("name", "Givelink");
        return "news"; // templates/post.html 파일 보여줌
    }

    @GetMapping("/community")
    public String community(Model model) {
        model.addAttribute("name", "Givelink");
        return "community"; // templates/about.html 파일 보여줌
    }

/*    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("name", "Givelink");
        return "contact"; // templates/contact.html 파일 보여줌
    }*/

}
