package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
    User selectByID(int id);

    /*
     MyBatis参数封装:
         * 单个参数:
             1.POJ0类型:直接使用,属性名 和 参数占位符名称一致
             2.Map集合:直接使用,键名 和 参数占位符名称一致
             3.Collection:封装为Map集合,可以使用@Param注解,替换Map集合中默认的arg键名
                map.put("arg0",collection集合)
                map.put("collection",collection集合)
             4.List:封装为Map集合,可以使用@Param注解,替换Map集合中默认的arg键名
                map.put("arg0",list集合)
                map.put("collection",list集合)
                map.put("list",list集合)
             5.Array:封装为Map集合,可以使用@Param注解,替换Map集合中默认的arg键名
                map.put("arg0",数组)
                map.put("array",数组)
             6.其他类型:直接使用
         * 多个参数:封装为Map集合
            map.put("arg0", 参数值1)
            map.put("param1", 参数值1)
            map.put("param2", 参数值2)
            map.put("arg1", 参数值2)
            ----------------@Param("username")
            map.put("username", 参数值1)
            map.put("param1", 参数值1)
            map.put("param2", 参数值2)
            map.put("arg1", 参数值2)
     */
    User select(@Param("username") String username, @Param("password") String password);
//    User select(String username, String password);
}
