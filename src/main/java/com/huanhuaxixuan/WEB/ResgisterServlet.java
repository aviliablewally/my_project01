package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Service.User1IMP;
import com.huanhuaxixuan.MYSQL.Service.UserIMP;
import com.huanhuaxixuan.MYSQL.Service.UserResgisterIMP;
import com.huanhuaxixuan.MYSQL.Service.bookIMP;
import com.huanhuaxixuan.prjo.User;
import com.huanhuaxixuan.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 浣花溪轩
 * @date 2024/2/27&3:28
 */
@WebServlet("/ResgisterServlet")
public class ResgisterServlet extends HttpServlet {
    private UserResgisterIMP context = new ApplicationContextUtil().getAppLicationContextResgister();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置文件编码，防止中文乱码
        req.setCharacterEncoding("UTF-8");
        // 设置响应的内容类型为HTML
        resp.setContentType("text/html;charset=UTF-8");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String email = req.getParameter("Email");
        Boolean selectByAccountResult = context.selectByAccount(account);
        if (!selectByAccountResult){
            User user = new User(account, password, email);
            context.insertUserByResgister(user);
            resp.getWriter().write("<p1>注册成功，点击进行<a href=\"Login.html\">登录</a></p1>");
            resp.sendRedirect("/Login.html");
        }else {
            resp.getWriter().write("<p1>该账号已存在，请重新<a href=\"Resgister.html\">注册</a></p1>");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
