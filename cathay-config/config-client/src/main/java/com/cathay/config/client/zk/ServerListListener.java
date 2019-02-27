package com.cathay.config.client.zk;

import com.cathay.config.client.config.AppConfiguration;
import com.cathay.config.client.util.SpringBeanFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ServerListListener implements Runnable{

    private static Logger logger = LoggerFactory.getLogger(ServerListListener.class);

    private ZkUtil zkUtil;

    private AppConfiguration appConfiguration ;


    public ServerListListener() {
        zkUtil = SpringBeanFactory.getBean(ZkUtil.class) ;
        appConfiguration = SpringBeanFactory.getBean(AppConfiguration.class) ;
    }

    public void run() {
        //注册监听服务
        zkUtil.subscribeEvent(appConfiguration.getZkRoot());

    }
}
