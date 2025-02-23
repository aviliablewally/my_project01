package com.huanhuaxixuan.MYSQL.Mapper;

import com.huanhuaxixuan.prjo.User;

/**
 * @author 浣花溪轩
 * @date 2024/2/21&23:22
 */
public interface UserResgisterMapper {
//    判断是否存在相同account
    Boolean selectByAccount(String account);

    void insertUserByResgister(User user);
}
