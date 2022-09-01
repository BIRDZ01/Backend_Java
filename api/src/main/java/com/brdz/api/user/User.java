package com.brdz.api.user;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="bird_id")
    private Integer id;

    @Column(name="screen_name")
    private String screenName;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="state")
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name="zipcode")
    private Integer zipcode;

    @Column(name="usercode")
    private Integer usercode;

    @Column(name="passcode")
    private Integer passcode;

    @Column(name="num_children")
    private Integer numChildren;

    @Column(name="er_contact_name")
    private String erContactName;

    @Column(name="er_contact_number")
    private Integer erContactNumber;

    @Column(name="er_contact_email")
    private String erContactEmail;


    public User(String screenName, String name, String address, String city, String state, Integer zipcode, Integer passcode, Integer numChildren, String erContactName, Integer erContactNumber, String erContactEmail, Integer usercode) {
        this.screenName = screenName;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = State.valueOf(state);
        this.zipcode = zipcode;
        this.passcode = passcode;
        this.numChildren = numChildren;
        this.erContactName = erContactName;
        this.erContactNumber = erContactNumber;
        this.erContactEmail = erContactEmail;
        this.usercode = usercode;
    }

    @Override
    public String toString() {
        return "User{" +
                "screenName='" + screenName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", usercode=" + usercode +
                ", passcode=" + passcode +
                ", numChildren=" + numChildren +
                ", erContactName='" + erContactName + '\'' +
                ", erContactNumber=" + erContactNumber +
                ", erContactEmail='" + erContactEmail + '\'' +
                '}';
    }
}
