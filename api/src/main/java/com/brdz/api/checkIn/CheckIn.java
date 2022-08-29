package com.brdz.api.checkIn;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
        MINIMUM,
        STANDBY,
        MAXIMUM
};

    public CheckIn(LocalDateTime check_in_time) {
        this.check_in_time = check_in_time;
    }
}
