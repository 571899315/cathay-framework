package com.cathay.config.server.service.impl;

import com.cathay.config.server.entity.CathayConfigEntity;
import com.cathay.config.server.mapper.CathayConfigMapper;
import com.cathay.config.server.service.CathayConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CathayConfigServiceImpl implements CathayConfigService {


    private CathayConfigMapper cathayConfigMapper;

    @Override
    public Integer insert(CathayConfigEntity cathayConfigEntity) {

        if (cathayConfigEntity == null) {
            return 0;
        }
        try {
            return cathayConfigMapper.insert(cathayConfigEntity);
        } catch (Exception e) {
            log.error("insert failure", e);
        }
        return 0;
    }
}
