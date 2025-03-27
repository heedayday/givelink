package com.java.givelink.serviceImpl;

import com.java.givelink.dto.PostDto;
import com.java.givelink.repository.PostRepository;
import com.java.givelink.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final PostRepository postRepository;

    @Override
    public List<PostDto> getMainPostList() {
        return postRepository.findAllWithJoin(); // 여기서 연결됨!
    }
}
