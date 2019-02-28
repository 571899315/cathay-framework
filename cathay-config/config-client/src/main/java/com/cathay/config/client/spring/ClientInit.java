package com.cathay.config.client.spring;

import com.cathay.config.common.zk.ZkUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClientInit {


    @Autowired
    private ZkUtil zkUtil;


    /**
     * init
     */
    @PostConstruct
    public void init() {
        /**
         * 1,从zk获取地址。
         */
        zkUtil.register("00","localhost:900");

        /**
         * 2,建立tcp连接
         */

        /**
         * 3,写入spring上下文
         */
        /**
         *4,写入文件
         */


    }


}
