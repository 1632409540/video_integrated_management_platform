package com.zerui.videoplatform.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import javax.annotation.Resource;

public abstract class BaseServiceImpl<T extends BaseEntity>{
    @Resource
    protected BaseMapper<T> baseMapper;
}
