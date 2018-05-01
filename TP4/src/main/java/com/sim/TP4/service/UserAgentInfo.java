package com.sim.TP4.service;

import eu.bitwalker.useragentutils.UserAgent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Service
@NoArgsConstructor
@Getter
@Setter
public class UserAgentInfo {


    private String browser;
    private String operativeSystem;
    private String osAndBrowser;


    public void info (String args) {

        UserAgent userAgent = UserAgent.parseUserAgentString(args);

        setBrowser(userAgent.getBrowser().getName());
        setOperativeSystem(userAgent.getOperatingSystem().toString());
        setOsAndBrowser(getBrowser()+" - "+getOperativeSystem());
    }
}
