package com.qf.withmycar.dto;

import lombok.Data;

@Data
public class Ck_UserCollect {

    private long id;
    private Integer fav_time;//收藏时间
    private String fav_ip;//ip
    private String title;//标题
    private Integer begin_time;//活动开始时间
    private Integer end_time;//活动结束时间
    private Byte state;//状态
    private String author;//作者
    private String thumb_pic;//咨询图片
    private String cover_pic;//活动图片
}
