package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Storage;
import com.wms.service.StorageService;
import com.wms.mapper.StorageMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
* @author 86182
* @description 针对表【storage】的数据库操作Service实现
* @createDate 2025-06-04 17:12:49
*/
@Mapper
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage>
    implements StorageService{

    @Resource
    private StorageMapper storageMapper;

    @Override
    public IPage pageCC(IPage<Storage> page, Wrapper wrapper) {
        return storageMapper.pageCC(page,wrapper);
    }


}




