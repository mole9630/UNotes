package com.mybatis.test;

import com.mybatis.mapper.BrandMapper;
import com.mybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {
    // 查询所有数据
    @Test
    public void testSelectAll() throws IOException {
        // 获取SqlSessionFactory
        // 加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper对象接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        // 释放资源
        sqlSession.close();
    }



    // 通过id查看详情
    @Test
    public void testSelectByID() throws IOException {
        // 接受参数
        int id = 1;
        // 获取SqlSessionFactory
        // 加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper对象接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        Brand brand = brandMapper.selectByIdBrand(id);
        System.out.println(brand);

        // 释放资源
        sqlSession.close();
    }



    // 条件查询
    @Test
    public void testSelectByCondition() throws IOException {
        // 接受参数
        int status = 1;
        String companyName = "小米";
        String brandName = "小米";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);

        // 封装Map
        Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);

        // 获取SqlSessionFactory
        // 加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper对象接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        List<Brand> brands1 = brandMapper.selectByCondition(status, companyName, brandName);
        List<Brand> brands2 = brandMapper.selectByCondition(brand);
        List<Brand> brands3 = brandMapper.selectByCondition(map);
        System.out.println(brands1);
        System.out.println(brands2);
        System.out.println(brands3);

        // 释放资源
        sqlSession.close();
    }



    // 动态条件查询
    @Test
    public void testSelectDynamicByCondition() throws IOException {
        // 接受参数
        int status = 1;
        String companyName = "小米";
        String brandName = "小米";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
        Brand brand = new Brand();
//        brand.setStatus(status);
        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        // 封装Map
        Map map = new HashMap();
//        map.put("status", status);
        map.put("companyName", companyName);
//        map.put("brandName", brandName);

        // 获取SqlSessionFactory
        // 加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper对象接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        List<Brand> brands1 = brandMapper.selectDynamicByCondition(status, companyName, brandName);
        List<Brand> brands2 = brandMapper.selectDynamicByCondition(brand);
        List<Brand> brands3 = brandMapper.selectDynamicByCondition(map);
        System.out.println(brands1);
        System.out.println(brands2);
        System.out.println(brands3);

        // 释放资源
        sqlSession.close();
    }


    // 单条件-动态查询
    @Test
    public void testSelectDynamicByConditionSingle() throws IOException {
        // 接受参数
        int status = 1;
        String companyName = "小米";
        String brandName = "小米";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        // 获取SqlSessionFactory
        // 加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper对象接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        List<Brand> brands = brandMapper.selectDynamicByConditionSingle(brand);
        System.out.println(brands);

        // 释放资源
        sqlSession.close();
    }
}
