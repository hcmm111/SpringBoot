package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
//告诉MyBatis这是dao接口，创建此接口的代理对象。
@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);

}
