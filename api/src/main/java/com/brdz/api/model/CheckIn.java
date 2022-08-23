package com.brdz.api.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="check_in_id")
    private Integer id;

    @Column(name="check_in_time")
    private LocalDateTime check_in_time;

//    TODO: Figure out how to make this work!
//    @Column(name="result")
    private enum result{
        WELL,
        OK,
        HELP
};
    public CheckIn(){}


}
