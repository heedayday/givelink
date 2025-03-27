package com.java.givelink.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    private int img_id;
    private int category_id;

    private String post_title;
    private String post_content;
    private String post_url;

    @ManyToOne
    @JoinColumn(name = "img_id")  // FK: post.img_id → img.id
    private Img image;

    @ManyToOne
    @JoinColumn(name = "category_id")  // FK: post.category_id → category.id
    private Category category;


}
