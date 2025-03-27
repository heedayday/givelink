package com.java.givelink.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "img")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Img {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int img_id;

    private String img_file_name;
    private String img_path;
}