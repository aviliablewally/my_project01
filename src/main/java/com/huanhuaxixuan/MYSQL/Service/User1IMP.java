package com.huanhuaxixuan.MYSQL.Service;

import com.huanhuaxixuan.MYSQL.Mapper.User1Mapper;
import com.huanhuaxixuan.prjo.User1;
import com.huanhuaxixuan.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/21&23:21
 */
public class User1IMP {
    private SqlSessionFactory factory = new SqlSessionFactoryUtil().getSqlSessionFactory();

    public User1 checkSeclect(String user) {
        boolean sign;
        SqlSession session = factory.openSession();
        User1 user1 = session.getMapper(User1Mapper.class).checkSeclect(user);
        session.close();
        return user1;
    }

//    public User1 selectONE(String user) {
//        SqlSession session = factory.openSession();
//        User1 userONE = session.getMapper(User1Mapper.class).selectONE(user);
//        session.close();
//        return userONE;
//    }


}
