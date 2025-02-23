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
 * @date 2024/2/25&0:02
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        root=${root}&id=${bookList.id}&cardID=2
        String root = req.getParameter("root");
        String bookid = req.getParameter("id");
        String cardID = req.getParameter("cardID");
        context.deleteBookByBookID(Integer.parseInt(bookid));

        req.setAttribute("username",root);
        req.setAttribute("cardID",cardID);
        req.getRequestDispatcher("/bookServlet").forward(req,resp);
    }
}
