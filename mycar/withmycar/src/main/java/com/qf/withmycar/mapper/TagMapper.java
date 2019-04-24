package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.Tag;
import com.qf.withmycar.vo.TagVo;

import java.util.List;

public interface TagMapper {

    List<Tag> selectUserTagByUserId(Long userId);

    /**
     * 系统
     */
    public List<TagVo> selectTagXiTong();
    /**
     * 用户
     */
    public List<TagVo> selectTagYongHu();

    /**
     * 移入移出标签
     */
    public void updateTag(Tag tag);

    public Integer selectId(Integer id);

    /**
     * 添加
     */
    public void addTag(Tag tag);

    /**
     * 删除
     */
    public void deleteTag(Integer id);

    /**
     * 根据name查询
     */
    public String selectName(String name);

    /*
    模糊查询
     */
    public List<TagVo> selectTagMoHu(String name);
}