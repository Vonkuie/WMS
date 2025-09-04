package com.wms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RecordRes extends  Record{

    private String username;
    private String adminname;
    private String goodsname;
    private String storagename;
    private String goodstypename;
//    private Date createtime;
}
