package com.cathay.config.server.mapper;

import com.cathay.config.server.entity.CathayConfigEntity;

import java.util.List;

public interface CathayConfigMapper {


    /**
     * 根据ID更新 配置信息全部属性
     *
     * @param CathayConfigEntity
     * @return 更新行数
     * @
     */
    Integer update(CathayConfigEntity CathayConfigEntity);

    /**
     * 根据ID删除 配置信息
     *
     * @param id
     * @return 删除行数
     * @
     */
    Integer deleteById(Long id);

    /**
     * 动态更新 配置信息部分属性，包括全部
     *
     * @param CathayConfigEntity
     * @return 更新行数
     * @
     */
    Integer updateDynamic(CathayConfigEntity CathayConfigEntity);

    /**
     * 根据ID查询 一个 配置信息
     *
     * @param id
     * @return CathayConfigEntity
     * @
     */
    CathayConfigEntity selectById(Long id);

    /**
     * 根据  配置信息 动态返回记录数
     *
     * @param CathayConfigEntity
     * @return 记录条数
     * @
     */
    Long selectCountDynamic(CathayConfigEntity CathayConfigEntity);

    /**
     * 根据  配置信息 动态返回 配置信息 列表
     *
     * @param CathayConfigEntity
     * @return List<CathayConfigEntity>
     * @
     */
    List<CathayConfigEntity> selectDynamic(CathayConfigEntity CathayConfigEntity);

    /**
     * 根据  配置信息 动态返回 配置信息 Limit 列表
     *
     * @param CathayConfigEntity start,pageSize属性必须指定
     * @return List<CathayConfigEntity>
     * @
     */
    List<CathayConfigEntity> selectDynamicPageQuery(CathayConfigEntity CathayConfigEntity);


}
