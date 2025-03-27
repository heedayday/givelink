package com.java.givelink.repository;

import com.java.givelink.domain.Post;
import com.java.givelink.dto.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT new com.java.givelink.dto.PostDto( " +
            "p.post_id, p.post_title, p.post_content, " +
            "p.post_url) " +
            "FROM Post p " +
            " " +
            "")
    List<PostDto> findAllWithJoin();

}
