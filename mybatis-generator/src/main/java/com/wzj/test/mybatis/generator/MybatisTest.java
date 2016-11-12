package com.wzj.test.mybatis.generator;

import com.wzj.test.mybatis.generator.entity.User;
import com.wzj.test.mybatis.generator.resoposity.UserMapper;
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
            User record = new User();
            record.setName("name04");
            record.setSex(false);
            userMapper.insert(record);
            System.out.println(record.getId());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
