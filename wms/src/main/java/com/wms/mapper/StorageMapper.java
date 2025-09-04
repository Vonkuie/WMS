package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 86182
* @description 针对表【storage】的数据库操作Mapper
* @createDate 2025-06-04 17:12:49
* @Entity com.wms.entity.Storage
*/
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    IPage pageCC(IPage<Storage> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}




