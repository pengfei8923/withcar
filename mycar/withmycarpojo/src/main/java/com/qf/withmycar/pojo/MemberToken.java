package com.qf.withmycar.pojo;

public class MemberToken {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_token.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_token.token
     *
     * @mbggenerated
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_token.create_time
     *
     * @mbggenerated
     */
    private Integer createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_token.duration
     *
     * @mbggenerated
     */
    private Integer duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_token.expired_time
     *
     * @mbggenerated
     */
    private Integer expiredTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_token.member_id
     *
     * @return the value of member_token.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_token.member_id
     *
     * @param memberId the value for member_token.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_token.token
     *
     * @return the value of member_token.token
     *
     * @mbggenerated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_token.token
     *
     * @param token the value for member_token.token
     *
     * @mbggenerated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_token.create_time
     *
     * @return the value of member_token.create_time
     *
     * @mbggenerated
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_token.create_time
     *
     * @param createTime the value for member_token.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_token.duration
     *
     * @return the value of member_token.duration
     *
     * @mbggenerated
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_token.duration
     *
     * @param duration the value for member_token.duration
     *
     * @mbggenerated
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_token.expired_time
     *
     * @return the value of member_token.expired_time
     *
     * @mbggenerated
     */
    public Integer getExpiredTime() {
        return expiredTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_token.expired_time
     *
     * @param expiredTime the value for member_token.expired_time
     *
     * @mbggenerated
     */
    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }
}