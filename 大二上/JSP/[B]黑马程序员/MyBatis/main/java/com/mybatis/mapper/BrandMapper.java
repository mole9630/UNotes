package com.mybatis.mapper;


import com.mybatis.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    // 查询所有
    @Select("select * from tb_brand")
    List<Brand> selectAll();

    // 查看详情
    Brand selectByIdBrand(int id);

    // 条件查询
    /**
     * * 参数接收
     *      1.散装参数:如方法中有多个参数,需使用@Param("SQL参数占位符名称")
     *      2.对象参数:对象的属性名称要和参数占位符名称一致
     *      3.map集合参数
     * @param status
     * @param companyName
     * @param brandName
     * @return
     */
    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);

    // 动态条件查询
    List<Brand> selectDynamicByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    List<Brand> selectDynamicByCondition(Brand brand);
    List<Brand> selectDynamicByCondition(Map map);

    // 单条件-动态查询
    List<Brand> selectDynamicByConditionSingle(Brand brand);

    // 添加功能
    void add(Brand brand);

    // 修改全部字段
    int update(Brand brand);

    // 修改动态字段
    int updateDynamic(Brand brand);

    // 根据id删除
    void deleteById(Integer id);

    // 批量删除
//    void deleteByIds(Integer[] ids);
    void deleteByIds(@Param("ids") Integer[] ids);
}
