package com.qf.withmycar.pojo;

public class ActivityKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_key.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_key.activity_id
     *
     * @mbggenerated
     */
    private Integer activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_key.create_time
     *
     * @mbggenerated
     */
    private Integer createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_key.keya
     *
     * @mbggenerated
     */
    private String keya;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_key.id
     *
     * @return the value of activity_key.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_key.id
     *
     * @param id the value for activity_key.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_key.activity_id
     *
     * @return the value of activity_key.activity_id
     *
     * @mbggenerated
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_key.activity_id
     *
     * @param activityId the value for activity_key.activity_id
     *
     * @mbggenerated
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_key.create_time
     *
     * @return the value of activity_key.create_time
     *
     * @mbggenerated
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_key.create_time
     *
     * @param createTime the value for activity_key.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_key.keya
     *
     * @return the value of activity_key.keya
     *
     * @mbggenerated
     */
    public String getKeya() {
        return keya;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_key.keya
     *
     * @param keya the value for activity_key.keya
     *
     * @mbggenerated
     */
    public void setKeya(String keya) {
        this.keya = keya == null ? null : keya.trim();
    }
}