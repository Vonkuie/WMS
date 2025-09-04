package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 86182
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-05-29 17:45:50
* @Entity com.wms.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    IPage<User> pageC(IPage<User> page);

    IPage pageCC(IPage<User> page,@Param(Constants.WRAPPER) Wrapper wrapper);
}




