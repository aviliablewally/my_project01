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
import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/28&1:15
 */
@WebServlet("/updateUserCardServlet")
public class updateUserCardServlet extends HttpServlet {
    private UserIMP contextUser = new ApplicationContextUtil().getAppLicationContextUser();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String userID = req.getParameter("id");
        System.out.println(userID);
        int id = Integer.parseInt(userID);
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String CardId = req.getParameter("userCardId");
        User user = new User(id, account, password, email, CardId);
        System.out.println(user);
        contextUser.updateByUserID(user);
        resp.sendRedirect("/updateUserCardTranferServlet?username=mangemant&cardID=2");
    }
}
