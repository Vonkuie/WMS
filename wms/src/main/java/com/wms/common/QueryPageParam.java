package com.wms.common;

import lombok.Data;

import java.util.HashMap;

@Data
public class QueryPageParam {

    //页面的默认值
    private static int PAGE_SIZE=20;
    private static int PAGE_NUM=1;

    private int pageSize=PAGE_SIZE;
    private int pageNum=PAGE_NUM;


    //将分页的参数与其他的参数分离开来，用整体代替其他的所有参数
    private HashMap param =new HashMap();
}
