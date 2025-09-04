package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Goodstype;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86182
* @description 针对表【goodstype】的数据库操作Service
* @createDate 2025-06-04 17:44:45
*/
public interface GoodstypeService extends IService<Goodstype> {

    IPage pageCC(Page<Goodstype> page, Wrapper wrapper);
}
