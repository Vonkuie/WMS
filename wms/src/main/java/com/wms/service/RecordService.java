package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Goods;
import com.wms.entity.Record;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86182
* @description 针对表【record】的数据库操作Service
* @createDate 2025-06-04 17:44:57
*/
public interface RecordService extends IService<Record> {

    IPage pageCC(Page<Record> page, Wrapper wrapper);
}
