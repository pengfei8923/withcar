package com.qf.withmycar.pojo;

public class DictAnswer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_answer.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_answer.weight_id
     *
     * @mbggenerated
     */
    private Integer weightId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_answer.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_answer.en_name
     *
     * @mbggenerated
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_answer.adjust_value
     *
     * @mbggenerated
     */
    private Integer adjustValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_answer.id
     *
     * @return the value of dict_answer.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_answer.id
     *
     * @param id the value for dict_answer.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_answer.weight_id
     *
     * @return the value of dict_answer.weight_id
     *
     * @mbggenerated
     */
    public Integer getWeightId() {
        return weightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_answer.weight_id
     *
     * @param weightId the value for dict_answer.weight_id
     *
     * @mbggenerated
     */
    public void setWeightId(Integer weightId) {
        this.weightId = weightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_answer.name
     *
     * @return the value of dict_answer.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_answer.name
     *
     * @param name the value for dict_answer.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_answer.en_name
     *
     * @return the value of dict_answer.en_name
     *
     * @mbggenerated
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_answer.en_name
     *
     * @param enName the value for dict_answer.en_name
     *
     * @mbggenerated
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_answer.adjust_value
     *
     * @return the value of dict_answer.adjust_value
     *
     * @mbggenerated
     */
    public Integer getAdjustValue() {
        return adjustValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_answer.adjust_value
     *
     * @param adjustValue the value for dict_answer.adjust_value
     *
     * @mbggenerated
     */
    public void setAdjustValue(Integer adjustValue) {
        this.adjustValue = adjustValue;
    }
}