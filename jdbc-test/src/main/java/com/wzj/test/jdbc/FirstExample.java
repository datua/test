package com.wzj.test.jdbc;

import java.sql.*;

/**
 * Created by wangzhijiang on 16/4/24.
 */
public class FirstExample {
    private static final String DB_USER = "cat";
    private static final String DB_PASSWD = "cat";

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cat_db";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 1 注册驱动
            Class.forName(DB_DRIVER);
            // 2 获取连接
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            // 3 查询
            statement = connection.createStatement();
            String sql = "select id, name, sex from user";
            resultSet = statement.executeQuery(sql);
            // 4 解析结果
            while (resultSet.next()) {
                System.out.println("user id: " + resultSet.getInt("id"));
                System.out.println("user name: " + resultSet.getString("name"));
                System.out.println("user sex: " + resultSet.getBoolean("sex"));
            }

            // 5 关闭连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
