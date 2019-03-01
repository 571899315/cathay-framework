package com.cathay.config.server.config;

import com.cathay.config.server.netty.ConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServerInit {


    @Autowired
    private ConfigServer configServer;


    @PostConstruct
    public void init() {


    }


}
