package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Service.bookIMP;
import com.huanhuaxixuan.prjo.Book;
import com.huanhuaxixuan.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author 浣花溪轩
 * @date 2024/2/26&7:23
 */
@WebServlet("/insertBookServlet")
public class insertBookServlet extends HttpServlet {


    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String root = req.getParameter("root");
        String cardID = req.getParameter("cardID");
        String bookName = req.getParameter("bookName");
        String bookWriter = req.getParameter("bookWriter");
        String bookBrief = req.getParameter("bookBrief");

        if (bookName.equals("")||bookWriter.equals("")||bookBrief.equals("")){
            resp.getWriter().write("<p1>上传数据为空</p1>");
        }else {
            Book book = new Book(bookName, bookWriter, bookBrief, "无", "0");

            context.insertBook(book);
            req.getRequestDispatcher("/bookServlet?username=" + root + "&cardID=" + cardID).forward(req, resp);
        }


    }
}
