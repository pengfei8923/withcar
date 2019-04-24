package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.AuditInformation;
import com.qf.withmycar.mapper.ArticleMapper;
import com.qf.withmycar.pojo.Article;
import com.qf.withmycar.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019.4.15.
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findAllArticle() {
        return articleMapper.findAllArticle();
    }

    @Override
    public List<Article> selectBy(String ss1,String ss2) {
        return articleMapper.selectBy(ss1,ss2);
    }

    @Override
    public void insertArticle(Article article) {
        articleMapper.insertArticle(article);
    }

    @Override
    public void deleteArticleById(int id) {
        articleMapper.deleteArticleById(id);
    }

    @Override
    public boolean updateArticle(AuditInformation information) {
        articleMapper.updateArticle(information);
        return true;
    }

    @Override
    public List<AuditInformation> selectByUsername() {
        List<AuditInformation> auditInformations = articleMapper.selectByUsername();
        return auditInformations;
    }

    @Override
    public AuditInformation selectById(Integer id) {
        return articleMapper.selectById(id);
    }

}
