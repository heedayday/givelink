package com.java.givelink.service;

import com.java.givelink.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {
    List<PostDto> getMainPostList();
}
