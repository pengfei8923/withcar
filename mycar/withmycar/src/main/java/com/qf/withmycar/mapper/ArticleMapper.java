package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.AuditInformation;
import com.qf.withmycar.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    public List<Article> findAllArticle();

    public List<Article> selectBy(@Param("ss1") String ss1, @Param("ss2") String ss2);

    public void updateArticle(AuditInformation information);

    public void insertArticle(Article article);

    public void deleteArticleById(int id);

    public List<AuditInformation> selectByUsername();

    public AuditInformation selectById(Integer id);
}