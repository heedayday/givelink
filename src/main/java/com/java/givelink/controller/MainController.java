package com.java.givelink.controller;

import com.java.givelink.dto.PostDto;
import com.java.givelink.service.MainService;
import com.java.givelink.vo.TestInfoVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private static final Logger logger = LogManager.getLogger(MainController.class);
    private final MainService mainService;


    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("postInfo", "post_title");
        logger.info("Givelink main method 사용중...DB 접근해서 데이터 가져와서 뿌려주기");
        log.info("lombok 로그 찍히나요?");
        List<PostDto> posts = mainService.getMainPostList();
        model.addAttribute("posts", posts);
        return "index"; // templates/home.html 파일 보여줌
    }

    @RequestMapping("/news")
    public String news(Model model, HttpSession session, HttpServletRequest request) {
        model.addAttribute("name", "Givelink");
        TestInfoVO testInfoVO = new TestInfoVO("은희", 31, "heecode@naver.com");
        TestInfoVO testInfoVO2 = TestInfoVO.builder().name("은희").age(31).email("hee").build();
        //log.info("session이 있긴하나?:"+session.getId()); 있긴하고 아마 데이터 값은 없을듯  추가를 안해줘서

        //Arrays.stream() 사용해보기
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers).sum();
        log.info("sum = {}", sum);

        String[] names = {"철수", "영희", "짱구", "영희"};

        long count = Arrays.stream(names)
                .filter(name -> name.equals("영희"))
                .count();

        log.info("count = {}", count);

        model.addAttribute("testInfo",testInfoVO);
        model.addAttribute("testInfo2",testInfoVO2);

        //여기서도 데이터를 추가해줄 수는 있음
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
