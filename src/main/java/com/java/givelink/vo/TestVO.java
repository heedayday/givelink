package com.java.givelink.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestVO {
    private String name;
    private String data;
    private String moment;
    private List<TestVO> list;
}
