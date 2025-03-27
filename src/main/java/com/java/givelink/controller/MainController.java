package com.java.givelink.controller;

import com.java.givelink.dto.PostDto;
import com.java.givelink.repository.PostRepository;
import com.java.givelink.service.MainService;
import com.java.givelink.serviceImpl.MainServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private static final Logger logger = LogManager.getLogger(MainController.class);
    private final MainService mainService;


    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("postInfo", "post_title");
        logger.info("Givelink main method 사용중...DB 접근해서 데이터 가져와서 뿌려주기");
        log.info("lombok 로그 찍히나요?");
        List<PostDto> posts = mainService.getMainPostList();
        model.addAttribute("posts", posts);


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
