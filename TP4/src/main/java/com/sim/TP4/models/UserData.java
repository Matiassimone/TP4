package com.sim.TP4.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Getter
@Setter
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;


    private String operativeSystem;
    private String browser;
    private  String osAndBrowser;


    public UserData (String operativeSystem, String browser, String osAndBrowser) {

        this.operativeSystem = operativeSystem;
        this.browser = browser;
        this.osAndBrowser = osAndBrowser;
    }

}
