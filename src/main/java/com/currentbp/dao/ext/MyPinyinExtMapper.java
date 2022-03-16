package com.currentbp.dao.ext;

import com.currentbp.module.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author baopan
 * @createTime 20220113
 */
@Mapper
@Repository
public interface MyPinyinExtMapper {

    public static final String allCarouselActivityFields = " id,pinyin,my_json ";

    @Select("<script>" +
            " select id,pinyin as name " +
            " from my_pinyin " +
            " where 1=1 and id = #{id}" +
            " limit 1 " +
            "</script>")
    Student queryStudent(@Param("id") Long id);
}
