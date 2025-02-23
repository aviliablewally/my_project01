package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Mapper.User1Mapper;
import com.huanhuaxixuan.MYSQL.Service.User1IMP;
import com.huanhuaxixuan.prjo.User1;
import com.huanhuaxixuan.util.ApplicationContextUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 浣花溪轩
 * @date 2024/2/21&23:00
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private User1IMP context = new ApplicationContextUtil().getAppLicationContextUser1();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置响应文本格式
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
//        获取input输入框内容
        String account = req.getParameter("account");
        String password = req.getParameter("password");
//        在控制台打印account和password
        System.out.println(account + ":" + password);
//        获取数据库对应账户的密码和身份ID
        User1 user1 = context.checkSeclect(account);
//        判断返回值是否为空
        if (user1 != null) {
            String psd = user1.getPassword();
            String cardID = user1.getCardID();
//            判断输入框密码与数据密码是否相同
            if (psd.equals(password)) {
//                若相同，进入图书管理系统
                resp.sendRedirect("/bookServlet?username=" + account + "&cardID=" + cardID);
            } else {
//                若不相同，回应密码错误
                System.out.println("密码错误不存在");
                resp.getWriter().write("<h2>该密码错误，请重新进行<a href=\"Login.html\">登录</a></h2>");
            }
        }else{
//            若为空，回应账户不存在
            System.out.println("账号不存在");
            resp.getWriter().write("<h2>该账号密码不存在，请进行<a href=\"Resgister.html\">注册</a></h2>");
        }

//        System.out.println(account+"   "+password);
    }
}
