package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class CarSeries implements Serializable {
    private Integer id;
    private String seriesName;
    private Integer brandId;
    private Integer facId;
    private Integer typeId;
    private Date createTime;
    private Date lastUpdate;

    @Override
    public String toString() {
        return "CarSeries{" +
                "id=" + id +
                ", seriesName='" + seriesName + '\'' +
                ", brandId=" + brandId +
                ", facId=" + facId +
                ", typeId=" + typeId +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
