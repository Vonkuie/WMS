package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Goodstype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 86182
* @description 针对表【goods】的数据库操作Mapper
* @createDate 2025-06-04 17:44:41
* @Entity com.wms.entity.Goods
*/
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    IPage pageCC(IPage<Goods> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}




