package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Order;

@Mapper
public interface OrderMapper {
    @Select("select * from user_order where id = #{id}")
    Order orderById(@Param("id") int id);
}
