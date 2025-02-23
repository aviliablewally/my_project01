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
import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/26&6:07
 */
@WebServlet("/updateBookServlet")
public class updateBookServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UtF-8");

        String bookID = req.getParameter("bookID");
        int id = Integer.parseInt(bookID);
        String root = req.getParameter("root");
        String bookName = req.getParameter("bookName");
        String bookWriter = req.getParameter("bookWriter");
        String bookBrief = req.getParameter("bookBrief");
        String cardID = req.getParameter("cardID");
        Book book = new Book(id, bookName, bookWriter, bookBrief,null,null);
        context.updateBook(book);
        req.getRequestDispatcher("/bookServlet?username=" + root + "&cardID=" +cardID).forward(req, resp);

    }
}

