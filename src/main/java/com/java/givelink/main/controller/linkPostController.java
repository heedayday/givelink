package com.java.givelink.main.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linkpost/main")
@Log4j2
public class linkPostController {

    @RequestMapping("/select")
    public String select() {
        log.info("linkpost select");
        return "linkpost select";
    }
}
