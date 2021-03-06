package com.qf.withmycar.pojo;

/**
 * 参数类型
 */
public class CarParamclass {

    private Integer pacid;

    private String pacname;//参数类型

    private String pacstate;//参数状态

    @Override
    public String toString() {
        return "CarParamclass{" +
                "pacid=" + pacid +
                ", pacname='" + pacname + '\'' +
                ", pacstate='" + pacstate + '\'' +
                '}';
    }

    public Integer getPacid() {
        return pacid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_paramclass.pacid
     *
     * @param pacid the value for car_paramclass.pacid
     *
     * @mbggenerated
     */
    public void setPacid(Integer pacid) {
        this.pacid = pacid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_paramclass.pacname
     *
     * @return the value of car_paramclass.pacname
     *
     * @mbggenerated
     */
    public String getPacname() {
        return pacname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_paramclass.pacname
     *
     * @param pacname the value for car_paramclass.pacname
     *
     * @mbggenerated
     */
    public void setPacname(String pacname) {
        this.pacname = pacname == null ? null : pacname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_paramclass.pacstate
     *
     * @return the value of car_paramclass.pacstate
     *
     * @mbggenerated
     */
    public String getPacstate() {
        return pacstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_paramclass.pacstate
     *
     * @param pacstate the value for car_paramclass.pacstate
     *
     * @mbggenerated
     */
    public void setPacstate(String pacstate) {
        this.pacstate = pacstate == null ? null : pacstate.trim();
    }
}