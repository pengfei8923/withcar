package com.qf.withmycar.pojo;

public class DictWeight {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_weight.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_weight.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_weight.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_weight.en_name
     *
     * @mbggenerated
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_weight.weight
     *
     * @mbggenerated
     */
    private Integer weight;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_weight.id
     *
     * @return the value of dict_weight.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_weight.id
     *
     * @param id the value for dict_weight.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_weight.code
     *
     * @return the value of dict_weight.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_weight.code
     *
     * @param code the value for dict_weight.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_weight.name
     *
     * @return the value of dict_weight.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_weight.name
     *
     * @param name the value for dict_weight.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_weight.en_name
     *
     * @return the value of dict_weight.en_name
     *
     * @mbggenerated
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_weight.en_name
     *
     * @param enName the value for dict_weight.en_name
     *
     * @mbggenerated
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_weight.weight
     *
     * @return the value of dict_weight.weight
     *
     * @mbggenerated
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_weight.weight
     *
     * @param weight the value for dict_weight.weight
     *
     * @mbggenerated
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}