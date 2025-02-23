package com.huanhuaxixuan.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 浣花溪轩
 * @date 2023/12/4&5:16
 */
public class SqlSessionFactoryUtil {
    static InputStream resourceAsStream = null;
    static SqlSessionFactory factory;

    static {

        String config = "mybatis-config.xml";
        try {
            resourceAsStream = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }

        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        try {
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }
}
