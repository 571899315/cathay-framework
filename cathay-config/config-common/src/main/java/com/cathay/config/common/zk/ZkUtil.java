package com.cathay.config.common.zk;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ZkUtil implements InitializingBean, Watcher {


    private ZooKeeper zk;


    @Value("${zk.server.address}")
    private String zkServers;

    @Value("${zk.server.timeout}")
    private int timeout;

    private static final String REGISTRY_PATH = "/registry";


    public void afterPropertiesSet() throws Exception {
        zk = new ZooKeeper(zkServers, timeout, this);
    }

    /**
     * 注册服务
     */
    public void register(String serviceName, String serviceAddress) {
        try {
            String registryPath = REGISTRY_PATH;
            if (zk.exists(registryPath, false) == null) {
                zk.create(registryPath, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                log.info("create registry node:{}", registryPath);
            }
            /**
             * 创建服务节点（持久节点）
             */
            String servicePath = registryPath + "/" + serviceName;
            if (zk.exists(servicePath, false) == null) {
                zk.create(servicePath, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                log.debug("create service node:{}", servicePath);
            }
            /**
             * 创建地址节点
             */
            String addressPath = servicePath + "/address-";
            String addressNode = zk.create(addressPath, serviceAddress.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
            log.debug("create address node:{} => {}", addressNode, serviceAddress);
        } catch (Exception e) {
            log.error("create node failure", e);
        }
    }









    public void process(WatchedEvent watchedEvent) {

    }
}
