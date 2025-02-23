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
 * @date 2024/2/25&17:17
 * 修改按键的中转方法
 */
@WebServlet("/updateBookTransferServlet")
public class updateBookTransferServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UtF-8");
        String root = req.getParameter("root");
        String bookID = req.getParameter("id");
        String userCardID = req.getParameter("cardID");
        List<Book> bookList = context.selectBookByID(bookID);
        req.setAttribute("bookList",bookList);
        req.setAttribute("root" ,root);
        req.setAttribute("cardID",userCardID);
        req.getRequestDispatcher("/updateBook.jsp").forward(req,resp);

    }
}
