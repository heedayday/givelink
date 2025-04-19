package com.java.givelink.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
}
