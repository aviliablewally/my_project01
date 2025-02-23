package com.huanhuaxixuan.MYSQL.Service;

import com.huanhuaxixuan.MYSQL.Mapper.UserResgisterMapper;
import com.huanhuaxixuan.prjo.User;
import com.huanhuaxixuan.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author 浣花溪轩
 * @date 2024/2/21&23:22
 */
public class UserResgisterIMP {
    private SqlSessionFactory factory = new SqlSessionFactoryUtil().getSqlSessionFactory();

//    判断是否存在相同account
    public Boolean selectByAccount(String account){
        SqlSession session = factory.openSession();
        Boolean selectResult = session.getMapper(UserResgisterMapper.class).selectByAccount(account);
        System.out.println(selectResult);
        session.close();
        return selectResult;
    }

//    增加用户数量通过注册表单
    public void insertUserByResgister(User user) {
        SqlSession session = factory.openSession(true);
        session.commit();
        session.getMapper(UserResgisterMapper.class).insertUserByResgister(user);
    }
}
