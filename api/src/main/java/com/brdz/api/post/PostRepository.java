package com.brdz.api.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findPostById(Integer Id);
    List<Post> findPostByBody(String postBody);
    List<Post> findPostByTime(LocalDateTime postTime);
}
