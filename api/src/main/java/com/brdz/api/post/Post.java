package com.brdz.api.post;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    private Integer id;

    @Column(name="post_body")
    private String postBody;

    @Column(name="post_time")
    private LocalDateTime postTime;

    public Post(String postBody, LocalDateTime postTime) {
        this.postBody = postBody;
        this.postTime = postTime;
    }
}
