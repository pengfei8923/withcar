package com.qf.withmycar.pojo;

public class ActivityLink {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_link.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_link.activity_id
     *
     * @mbggenerated
     */
    private Integer activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_link.channel_id
     *
     * @mbggenerated
     */
    private Integer channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_link.link
     *
     * @mbggenerated
     */
    private String link;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_link.id
     *
     * @return the value of activity_link.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_link.id
     *
     * @param id the value for activity_link.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_link.activity_id
     *
     * @return the value of activity_link.activity_id
     *
     * @mbggenerated
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_link.activity_id
     *
     * @param activityId the value for activity_link.activity_id
     *
     * @mbggenerated
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_link.channel_id
     *
     * @return the value of activity_link.channel_id
     *
     * @mbggenerated
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_link.channel_id
     *
     * @param channelId the value for activity_link.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_link.link
     *
     * @return the value of activity_link.link
     *
     * @mbggenerated
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_link.link
     *
     * @param link the value for activity_link.link
     *
     * @mbggenerated
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }
}