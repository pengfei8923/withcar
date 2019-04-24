package com.qf.withmycar.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Tag {
    private Integer id;
    private String name;
    private Integer is_deleted;
    private Date create_time;
    private Date last_update_time;
    private Integer click_count;
    private Integer type;

    public Tag() {
        super();
    }

    public Tag(Integer id, Integer type) {
        this.id = id;
        this.type = type;
    }


}