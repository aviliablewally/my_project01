package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Service.UserIMP;
import com.huanhuaxixuan.prjo.User;
import com.huanhuaxixuan.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/28&1:15
 */
@WebServlet("/updateUserCardTranferServlet")
public class updateUserCardTranferServlet extends HttpServlet {
    private UserIMP contextUser = new ApplicationContextUtil().getAppLicationContextUser();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<User> list = contextUser.selectAllUser();
        String username = req.getParameter("username");
        System.out.println(username);
        String cardID = req.getParameter("cardID");
        req.setAttribute("User", list);
        req.setAttribute("username", username);
        req.setAttribute("cardID", cardID);
        req.getRequestDispatcher("/updateUserCord.jsp").forward(req, resp);
    }
}
