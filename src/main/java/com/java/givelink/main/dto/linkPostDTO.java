package com.java.givelink.main.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class linkPostDTO {
    private String linkPostNum;
    private String linkPostName;
    private String linkPostTitle;
    private String linkPostDescription;
    private String linkPostImgName;
    private String linkPostDate;
    private String linkPostTag;
}
