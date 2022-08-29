package com.brdz.api.user;

import lombok.*;

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

//    TODO: Figure out how to make this work!!
//    @Enumerated(EnumType.STRING)
//    @Column(name="state")
    private enum state{
        AL,
        AK,
        AZ,
        AR,
        CA,
        CO,
        CT,
        DE,
        FL,
        GA,
        HI,
        ID,
        IL,
        IN,
        IA,
        KS,
        KY,
        LA,
        ME,
        MD,
        MA,
        MI,
        MN,
        MS,
        MO,
        MT,
        NE,
        NV,
        NH,
        NJ,
        NM,
        NY,
        NC,
        ND,
        OH,
        OK,
        OR,
        PA,
        RI,
        SC,
        SD,
        TN,
        TX,
        UT,
        VT,
        VA,
        WA,
        WV,
        WI,
        WY
    };

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


    public User(String screenName, String name, String address, String city, Integer zipcode, Integer passcode, Integer numChildren, String erContactName, Integer erContactNumber, String erContactEmail, Integer usercode) {
        this.screenName = screenName;
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.passcode = passcode;
        this.numChildren = numChildren;
        this.erContactName = erContactName;
        this.erContactNumber = erContactNumber;
        this.erContactEmail = erContactEmail;
        this.usercode = usercode;
    }
}
