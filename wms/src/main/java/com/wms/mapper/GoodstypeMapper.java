package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Goodstype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 86182
* @description 针对表【goodstype】的数据库操作Mapper
* @createDate 2025-06-04 17:44:45
* @Entity com.wms.entity.Goodstype
*/
@Mapper
public interface GoodstypeMapper extends BaseMapper<Goodstype> {
    IPage pageCC(IPage<Goodstype> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}




