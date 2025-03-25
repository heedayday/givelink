package com.java.givelink.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class MainController {

    private static final Logger logger = LogManager.getLogger(MainController.class);

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("postInfo", "post_title");
        logger.info("Givelink main method 사용중...DB 접근해서 데이터 가져와서 뿌려주기");




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
