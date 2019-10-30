package com.ciec.prepaid.dao.mapper;

import com.ciec.prepaid.dao.entity.PrepaidUser;
import com.ciec.prepaid.dao.entity.PrepaidUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PrepaidUserMapper {
    int countByExample(PrepaidUserExample example);

    int deleteByExample(PrepaidUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrepaidUser record);

    int insertSelective(PrepaidUser record);

    List<PrepaidUser> selectByExample(PrepaidUserExample example);

    PrepaidUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrepaidUser record, @Param("example") PrepaidUserExample example);

    int updateByExample(@Param("record") PrepaidUser record, @Param("example") PrepaidUserExample example);

    int updateByPrimaryKeySelective(PrepaidUser record);

    int updateByPrimaryKey(PrepaidUser record);
}