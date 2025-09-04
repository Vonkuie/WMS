package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Goodstype;
import com.wms.mapper.StorageMapper;
import com.wms.service.GoodsService;
import com.wms.service.GoodstypeService;
import com.wms.mapper.GoodstypeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
* @author 86182
* @description 针对表【goodstype】的数据库操作Service实现
* @createDate 2025-06-04 17:44:45
*/
@Service
public class GoodstypeServiceImpl extends ServiceImpl<GoodstypeMapper, Goodstype>
    implements GoodstypeService{

    @Resource
    private GoodstypeMapper goodstypeMapper;

    @Override
    public IPage pageCC(Page<Goodstype> page, Wrapper wrapper) {
        return goodstypeMapper.pageCC(page,wrapper);
    }
}




