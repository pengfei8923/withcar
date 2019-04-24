package com.qf.withmycar.pojo;

public class OperateLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.operate_time
     *
     * @mbggenerated
     */
    private Integer operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.operate_uid
     *
     * @mbggenerated
     */
    private Integer operateUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.table_name
     *
     * @mbggenerated
     */
    private String tableName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.table_disname
     *
     * @mbggenerated
     */
    private String tableDisname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.data_id
     *
     * @mbggenerated
     */
    private Long dataId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operate_log.operate_desc
     *
     * @mbggenerated
     */
    private String operateDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.id
     *
     * @return the value of operate_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.id
     *
     * @param id the value for operate_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.operate_time
     *
     * @return the value of operate_log.operate_time
     *
     * @mbggenerated
     */
    public Integer getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.operate_time
     *
     * @param operateTime the value for operate_log.operate_time
     *
     * @mbggenerated
     */
    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.operate_uid
     *
     * @return the value of operate_log.operate_uid
     *
     * @mbggenerated
     */
    public Integer getOperateUid() {
        return operateUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.operate_uid
     *
     * @param operateUid the value for operate_log.operate_uid
     *
     * @mbggenerated
     */
    public void setOperateUid(Integer operateUid) {
        this.operateUid = operateUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.table_name
     *
     * @return the value of operate_log.table_name
     *
     * @mbggenerated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.table_name
     *
     * @param tableName the value for operate_log.table_name
     *
     * @mbggenerated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.table_disname
     *
     * @return the value of operate_log.table_disname
     *
     * @mbggenerated
     */
    public String getTableDisname() {
        return tableDisname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.table_disname
     *
     * @param tableDisname the value for operate_log.table_disname
     *
     * @mbggenerated
     */
    public void setTableDisname(String tableDisname) {
        this.tableDisname = tableDisname == null ? null : tableDisname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.data_id
     *
     * @return the value of operate_log.data_id
     *
     * @mbggenerated
     */
    public Long getDataId() {
        return dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.data_id
     *
     * @param dataId the value for operate_log.data_id
     *
     * @mbggenerated
     */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operate_log.operate_desc
     *
     * @return the value of operate_log.operate_desc
     *
     * @mbggenerated
     */
    public String getOperateDesc() {
        return operateDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operate_log.operate_desc
     *
     * @param operateDesc the value for operate_log.operate_desc
     *
     * @mbggenerated
     */
    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc == null ? null : operateDesc.trim();
    }
}