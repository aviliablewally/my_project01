package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Service.bookIMP;
import com.huanhuaxixuan.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 浣花溪轩
 * @date 2024/2/25&17:17
 * 修改按键的中转方法
 */
@WebServlet("/insertBookTransferServlet")
public class insertBookTransferServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String root = req.getParameter("root");
        String cardID = req.getParameter("cardID");
        req.setAttribute("root" ,root);
        req.setAttribute("cardID" ,cardID);
        req.getRequestDispatcher("insertBook.jsp").forward(req,resp);
    }
}
