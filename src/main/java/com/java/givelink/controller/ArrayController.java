package com.java.givelink.controller;

import com.java.givelink.vo.TestInfoVO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequiredArgsConstructor
@Slf4j
public class ArrayController {

    @RequestMapping("/test/testData.ajax")
    @ResponseBody
    public Map<String, Object> testData() {
        log.info("도착은 하는 지 확인");

        Map<String, Object> map = new HashMap<>();
        map.put("ajax_code", "S");
        map.put("testData", "성공했습니다.");

        return map;
    }
}
