package io.github.opensabe.common.mybatis.test.mapper.user;


import io.github.opensabe.common.mybatis.base.BaseMapper;
import io.github.opensabe.common.mybatis.test.po.User;
import org.apache.ibatis.annotations.Update;
import io.github.opensabe.common.mybatis.types.JSONTypeHandler;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Update("truncate table t_user")
    void truncateTable ();

    @Select("select id, first_name, last_name, create_time, properties from t_user where id = #{id,jdbcType=VARCHAR}")
    @Results(id = "findUserById", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "first_name", property = "firstName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "last_name", property = "lastName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.DATE),
            @Result(column = "properties", property = "properties", jdbcType = JdbcType.VARCHAR ,typeHandler = JSONTypeHandler.class),
    })
    User findUserById(String id);

    @Select("select /*# mode=readonly */ * from t_user")
    List<User> selectReadOnly ();
}
