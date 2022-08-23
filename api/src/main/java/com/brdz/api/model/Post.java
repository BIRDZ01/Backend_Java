package com.brdz.api.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    private Integer id;

    @Column(name="post_body")
    private String postBody;

    @Column(name="post_time")
    private LocalDateTime postTime;

    public Post(){}

}
