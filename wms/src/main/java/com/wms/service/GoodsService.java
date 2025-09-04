package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Goodstype;

/**
* @author 86182
* @description 针对表【goods】的数据库操作Service
* @createDate 2025-06-04 17:44:41
*/
public interface GoodsService extends IService<Goods> {

    IPage pageCC(Page<Goods> page, Wrapper wrapper);
}
