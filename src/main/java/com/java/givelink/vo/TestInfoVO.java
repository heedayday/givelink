package com.java.givelink.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
public class TestInfoVO {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String email;

}
