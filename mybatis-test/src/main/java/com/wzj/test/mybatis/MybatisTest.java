package com.wzj.test.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by wangzhijiang on 17/4/2016.
 */
public class MybatisTest {

    public static void main(String[] args) {
        String configPath = "mybatis-config.xml";

        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream(configPath);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            sqlSession = sqlSessionFactory.openSession();
            User user = sqlSession.selectOne("com.wzj.test.mybatis.UserMapper.selectUser", 1);
            System.out.println(user.toString());

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            user = userMapper.selectUser(1);
            System.out.println(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
