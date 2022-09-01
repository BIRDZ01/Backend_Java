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
    private LocalDateTime checkInTime;


    @Column(name="result")
    @Enumerated(EnumType.STRING)
    private Result result;

    public CheckIn(LocalDateTime checkInTime, String result) {
        this.checkInTime = checkInTime; this.result = Result.valueOf(result);
    }

    @Override
    public String toString() {
        return "CheckIn{" +
                "checkInTime=" + checkInTime +
                ", result=" + result +
                '}';
    }
}
