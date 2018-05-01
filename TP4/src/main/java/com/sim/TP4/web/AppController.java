package com.sim.TP4.web;

import com.sim.TP4.models.UserData;
import com.sim.TP4.repository.UserRepository;
import com.sim.TP4.service.UserAgentInfo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@NoArgsConstructor
@RequestMapping("")
public class AppController {

    @Autowired
    private UserAgentInfo userAgentInfo;

    @Autowired
    private UserRepository repository;


    @RequestMapping("")
    private void userBrowserStats (@RequestHeader("User-Agent") String args) {

        this.userAgentInfo.info(args);

        repository.save(new UserData(this.userAgentInfo.getOperativeSystem(),this.userAgentInfo.getBrowser(), this.userAgentInfo.getOsAndBrowser()));
    }

    @RequestMapping("/browser")
    private void getMostUtilizedBrowser() {

        System.out.println(repository.mostUtilizedBrowser().toString());
    }

    @RequestMapping("/operativeSystem")
    private void getMostUtilizedOperativeSystem() {

        System.out.println(repository.mostUtilizedOperativeSystem().toString());
    }

    @RequestMapping("/browserAndOs")
    private void getMostUtilizedBrowserAndOs() {

        System.out.println(repository.mostUtilizedBrowserAndOs().toString());
    }

    @RequestMapping("/all")
    private void getMostUtilizedAll() {

        System.out.println(repository.mostUtilizedBrowser().toString());
        System.out.println(repository.mostUtilizedOperativeSystem().toString());
        System.out.println(repository.mostUtilizedBrowserAndOs().toString());
    }



}
