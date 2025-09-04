package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Goods;
import com.wms.entity.Record;
import com.wms.mapper.GoodsMapper;
import com.wms.service.RecordService;
import com.wms.mapper.RecordMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
* @author 86182
* @description 针对表【record】的数据库操作Service实现
* @createDate 2025-06-04 17:44:57
*/
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record>
    implements RecordService{

    @Resource
    private RecordMapper recordMapper;

    @Override
    public IPage pageCC(Page<Record> page, Wrapper wrapper) {
        return recordMapper.pageCC(page,wrapper);
    }
}




