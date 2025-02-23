package com.huanhuaxixuan.MYSQL.Service;

import com.huanhuaxixuan.MYSQL.Mapper.UserMapper;
import com.huanhuaxixuan.MYSQL.Mapper.bookMapper;
import com.huanhuaxixuan.prjo.User;
import com.huanhuaxixuan.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/27&1:51
 */
public class UserIMP {
    private SqlSessionFactory factory = new SqlSessionFactoryUtil().getSqlSessionFactory();

    public User selectByAccount(String account){
        SqlSession session = factory.openSession();
        User user = session.getMapper(UserMapper.class).selectByAccount(account);
        session.close();
        return user;
    }

    public void updateByUserID(User user){
        try (SqlSession session = factory.openSession(true)) {
            session.getMapper(UserMapper.class).updateByUserID(user);
            session.commit();
        } catch (Exception e) {
            // 异常处理逻辑，例如记录日志、抛出自定义异常等
            e.printStackTrace();
            System.out.println("错误方法updateByUserID");
        }
    }
    public List<User> selectAllUser(){
        SqlSession session = factory.openSession();
        List<User> list = session.getMapper(UserMapper.class).selectAllUser();
        session.close();
        return list;
    }
}
