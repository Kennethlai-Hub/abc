package cn.eternacell.info.mapper;

import cn.eternacell.info.entity.Mobilephone;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MobilephoneMapper extends Mapper<Mobilephone> {

    @Select({
            "select * from mobilephone",
            "where name like #{query} LIMIT #{begin},#{pagesize}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="model", property="model", jdbcType= JdbcType.VARCHAR),
            @Result(column="purchasetype", property="purchasetype", jdbcType= JdbcType.VARCHAR),
            @Result(column="orderdate", property="orderdate", jdbcType= JdbcType.DATE),
            @Result(column="expiredate", property="expiredate", jdbcType= JdbcType.DATE),
            @Result(column="sn", property="sn", jdbcType= JdbcType.VARCHAR),
            @Result(column="userid", property="userid", jdbcType= JdbcType.INTEGER),
            @Result(column="serviceid", property="serviceid", jdbcType= JdbcType.INTEGER),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="remark", property="remark", jdbcType= JdbcType.VARCHAR)
    })
    List<Mobilephone> selectByQuery(@Param("begin") int begin, @Param("pagesize") int pageSize, @Param("query") String query);
}
