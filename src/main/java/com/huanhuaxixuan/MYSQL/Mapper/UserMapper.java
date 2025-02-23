package com.huanhuaxixuan.MYSQL.Mapper;

import com.huanhuaxixuan.prjo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/27&2:20
 */
public interface UserMapper {
    User selectByAccount(@Param("account") String account);
    void updateByUserID(User user);
    List<User> selectAllUser();

}
