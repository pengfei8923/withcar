package com.qf.withmycar.pojo;

import lombok.Data;

@Data
public class MemberCar {

    private Long id;
    private Long memberId;
    private Integer brandId;
    private Integer makeId;
    private Integer modelId;
    private Integer carId;
    private Integer buyYear;
    private Integer currentMileage;
    private String remark;
    private Byte type;
    private String createTime;
    private String lastUpdateTime;

}