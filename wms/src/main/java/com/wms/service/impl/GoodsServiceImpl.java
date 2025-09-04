package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wms.entity.Goods;
import com.wms.entity.Goodstype;
import com.wms.mapper.GoodstypeMapper;
import com.wms.mapper.StorageMapper;
import com.wms.service.GoodsService;
import com.wms.mapper.GoodsMapper;
import com.wms.service.GoodstypeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


/**
* @author 86182
* @description 针对表【goods】的数据库操作Service实现
* @createDate 2025-06-04 17:44:41
*/
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public IPage pageCC(Page<Goods> page, Wrapper wrapper) {
        return goodsMapper.pageCC(page,wrapper);
    }


}




