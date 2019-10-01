package com.kongzhu.demo.mybatis;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis工具类
 * @author caiwenlong
 *
 */
public class MyBatisHelper {
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 从 XML 中构建 SqlSessionFactory
     */
    static {
        // XML配置文件相对路径
        String resource = "com/kongzhu/demo/mybatis/mybatis-config.xml";
        // Resources工具类，使从 classpath 或其他位置加载资源文件更加容易
        try(InputStream in = Resources.getResourceAsStream(resource)) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从 SqlSessionFactory 中获取 SqlSession
     * @return
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 该类不允许创建对象，仅作为工具类使用
     */
    private MyBatisHelper() {}
}
