package com.huanhuaxixuan.util;


import com.huanhuaxixuan.MYSQL.Mapper.User1Mapper;
import com.huanhuaxixuan.MYSQL.Service.User1IMP;
import com.huanhuaxixuan.MYSQL.Service.UserIMP;
import com.huanhuaxixuan.MYSQL.Service.UserResgisterIMP;
import com.huanhuaxixuan.MYSQL.Service.bookIMP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 浣花溪轩
 * @date 2023/12/4&5:08
 */
public class ApplicationContextUtil {
    static User1IMP user1Bean;
    static bookIMP bookBean;
    static UserIMP userBean;
    static UserResgisterIMP userResgisterIMP;

    public User1IMP getAppLicationContextUser1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("APPLocationContext.xml");
        context.registerShutdownHook();
        user1Bean = (User1IMP) context.getBean("user1Bean");
        context.close();
        return user1Bean;
    }

    public UserIMP getAppLicationContextUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("APPLocationContext.xml");
        context.registerShutdownHook();
        userBean = (UserIMP) context.getBean("userBean");
        context.close();
        return userBean;
    }

    public bookIMP getAppLicationContextBook() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("APPLocationContext.xml");
        context.registerShutdownHook();
        bookBean = (bookIMP) context.getBean("bookBean");
        context.close();
        return bookBean;
    }
    public UserResgisterIMP getAppLicationContextResgister() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("APPLocationContext.xml");
        context.registerShutdownHook();
        userResgisterIMP = (UserResgisterIMP) context.getBean("resgisterBean");
        context.close();
        return userResgisterIMP;
    }
}
