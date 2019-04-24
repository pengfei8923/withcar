package com.qf.withmycar.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2019.4.16.
 */
@Data
public class AuditInformation {
       private Integer id;
       private String title;
       private String source;
       private String author;
       private Date createTime;
       private Integer accessCount;
       private Integer likeCount;
       private Integer favCount;
       private Integer shareCount;
       private String state;
       private String username;
}
