package com.tcl.mianshi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tcl.mianshi.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;


/**
* @author tcl
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-02-12 21:26:45
*/
public interface QuestionMapper extends BaseMapper<Question> {

    /**
     * 查询题目列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date fiveMinutesAgoDate);
}




