package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.ArticleTag;

public interface ArticleTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    int insert(ArticleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    int insertSelective(ArticleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    ArticleTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleTag record);
}