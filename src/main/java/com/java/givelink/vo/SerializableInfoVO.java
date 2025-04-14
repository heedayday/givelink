package com.java.givelink.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class SerializableInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String email;

}
