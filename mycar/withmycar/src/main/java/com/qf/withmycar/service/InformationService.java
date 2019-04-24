package com.qf.withmycar.service;

import com.qf.withmycar.dto.AuditInformation;
import com.qf.withmycar.pojo.Article;

import java.util.List;

/**
 * Created by Administrator on 2019.4.15.
 */
public interface InformationService {
    public List<Article> findAllArticle();

    public List<Article> selectBy(String ss1, String ss2);

    public void insertArticle(Article article);

    public void deleteArticleById(int id);

    public boolean updateArticle(AuditInformation information);

    public List<AuditInformation> selectByUsername();

    public AuditInformation selectById(Integer id);

}
