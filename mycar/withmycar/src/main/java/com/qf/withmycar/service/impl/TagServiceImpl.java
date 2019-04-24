package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.TagMapper;
import com.qf.withmycar.pojo.Tag;
import com.qf.withmycar.service.TagService;
import com.qf.withmycar.vo.TagVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TagServiceImpl implements TagService {
    @Autowired(required = false)
    TagMapper tagMapper;
    //查询用户标签
    @Override
    public List<Tag> getUserTag(Long userId) {
        return tagMapper.selectUserTagByUserId(userId);
    }

    @Override
    public List<TagVo> selectTagXiTong() {
        return tagMapper.selectTagXiTong();
    }

    @Override
    public List<TagVo> selectTagYongHu() {
        return tagMapper.selectTagYongHu();
    }

    @Override
    public void updateTag(Tag tag) {
        tagMapper.updateTag(tag);
    }

    @Override
    public Integer selectId(Integer id) {
        return tagMapper.selectId(id);
    }

    @Override
    public void addTag(Tag tag) {
        tagMapper.addTag(tag);
    }

    @Override
    public void deleteTag(Integer id) {
        tagMapper.deleteTag(id);
    }

    @Override
    public String selectName(String name) {
        return tagMapper.selectName(name);
    }

    @Override
    public List<TagVo> selectTagMoHu(String name) {
        return tagMapper.selectTagMoHu(name);
    }
}
