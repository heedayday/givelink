package com.java.givelink.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private int postId;
    //private int imgId;
    //private int categoryId;
    private String postTitle;
    private String postContent;
    private String postUrl;
    //private String imgFileName;
    //private String imgPath;
    //private String categoryName;
}
