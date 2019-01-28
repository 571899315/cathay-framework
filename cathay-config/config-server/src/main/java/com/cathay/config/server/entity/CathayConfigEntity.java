package com.cathay.config.server.entity;

import com.cathay.mybatis.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Getter
@Setter
public class CathayConfigEntity extends BaseEntity {


    public Serializable getId() {
        return id;
    }


    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 应用名称 */
    private String appName;

    /** 应用环境名称 */
    private String appEnv;

    /** key */
    private String key;

    /** value */
    private String value;

    /** 注释 */
    private String comment;

    /**  */
    private Date gmtCreated;

    /**  */
    private Date gmtModified;





}
