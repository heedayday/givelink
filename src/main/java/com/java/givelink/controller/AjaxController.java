package com.java.givelink.controller;

import com.java.givelink.vo.TestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequiredArgsConstructor
@Slf4j
public class AjaxController {

    @RequestMapping("/test/testData.ajax")
    @ResponseBody
    public String testData() {
        log.info("도착은 하는 지 확인");
        return "";
    }

    @RequestMapping("/test/testVo.ajax")
    @ResponseBody
    public TestVO testVo() {
        log.info("/test/testvo 도착");
        List<TestVO> list = new ArrayList<>();

        //list에 추가할 TestVo
        TestVO list1  = TestVO.builder()
                .name("name1")
                .data("test1")
                .moment("now1")
                .list(null)  //.list(list)를 쓰면 돌고 도는 모양이 됨
                .build();
        TestVO list2  = TestVO.builder()
                .name("name2")
                .data("test2")
                .moment("now2")
                .list(null)
                .build();
        TestVO list3  = TestVO.builder()
                .name("name3")
                .data("test3")
                .moment("now3")
                .list(null)
                .build();


        list.add(list1);
        list.add(list2);
        list.add(list3);
       // log.info(list.toString());

        TestVO test  = TestVO.builder()
                .name("name")
                .data("test")
                .moment("now")
                .list(list)
                .build();

        //log.info(test.toString());

        return test;
    }
}
