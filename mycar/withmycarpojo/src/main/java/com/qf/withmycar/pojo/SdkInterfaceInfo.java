package com.qf.withmycar.pojo;

public class SdkInterfaceInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdk_interface_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdk_interface_info.activity_id
     *
     * @mbggenerated
     */
    private Integer activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdk_interface_info.cars_id
     *
     * @mbggenerated
     */
    private String carsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdk_interface_info.activity_key
     *
     * @mbggenerated
     */
    private String activityKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdk_interface_info.dealer
     *
     * @mbggenerated
     */
    private String dealer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdk_interface_info.id
     *
     * @return the value of sdk_interface_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdk_interface_info.id
     *
     * @param id the value for sdk_interface_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdk_interface_info.activity_id
     *
     * @return the value of sdk_interface_info.activity_id
     *
     * @mbggenerated
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdk_interface_info.activity_id
     *
     * @param activityId the value for sdk_interface_info.activity_id
     *
     * @mbggenerated
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdk_interface_info.cars_id
     *
     * @return the value of sdk_interface_info.cars_id
     *
     * @mbggenerated
     */
    public String getCarsId() {
        return carsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdk_interface_info.cars_id
     *
     * @param carsId the value for sdk_interface_info.cars_id
     *
     * @mbggenerated
     */
    public void setCarsId(String carsId) {
        this.carsId = carsId == null ? null : carsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdk_interface_info.activity_key
     *
     * @return the value of sdk_interface_info.activity_key
     *
     * @mbggenerated
     */
    public String getActivityKey() {
        return activityKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdk_interface_info.activity_key
     *
     * @param activityKey the value for sdk_interface_info.activity_key
     *
     * @mbggenerated
     */
    public void setActivityKey(String activityKey) {
        this.activityKey = activityKey == null ? null : activityKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdk_interface_info.dealer
     *
     * @return the value of sdk_interface_info.dealer
     *
     * @mbggenerated
     */
    public String getDealer() {
        return dealer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdk_interface_info.dealer
     *
     * @param dealer the value for sdk_interface_info.dealer
     *
     * @mbggenerated
     */
    public void setDealer(String dealer) {
        this.dealer = dealer == null ? null : dealer.trim();
    }
}