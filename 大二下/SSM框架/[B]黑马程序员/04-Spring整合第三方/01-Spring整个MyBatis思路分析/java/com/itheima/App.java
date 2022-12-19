package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
        // 初始化SqlSessionFactory
        // 1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2.加载SqlMaoConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 3.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // 获取连接, 获取实现
        // 4.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5.执行SqlSession对象执行查询, 获取结果
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        // 获取数据层接口
        Account account = accountDao.findById(1);
        System.out.println(account);

        // 关闭连接
        // 6.释放资源
        sqlSession.close();
    }
}
