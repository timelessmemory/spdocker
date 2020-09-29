package com.timeless.spdocker;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {

    @Select("select * from biu_district")
    List<Map<String, Object>> select();
}
