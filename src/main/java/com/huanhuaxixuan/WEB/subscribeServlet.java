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
 * @date 2024/2/25&0:02
 * 订阅服务
 */
@WebServlet("/subscribeServlet")
public class subscribeServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UtF-8");
        String reader = req.getParameter("reader");
        String id = req.getParameter("id");
        String cardID = req.getParameter("cardID");
        context.UpdateReaderByBookID(id, reader);
            List<Book> bookList = context.selectAll();

            for (int i = 0; i < bookList.size(); i++) {
                String brief = "";
                String bookBrief = bookList.get(i).getBookBrief();
                for (int num = 0; num < bookBrief.length(); num++) {
                    char c = bookBrief.charAt(num);

                    if (num % 40 == 0) {
                        brief += "<br>";
                        brief += c;
                    }else {
                        brief += c;
                    }
                }
                bookList.get(i).setBookBrief(brief);
            }
            req.setAttribute("bookList", bookList);
            req.setAttribute("root", reader);
            req.setAttribute("cardID",cardID);
            req.getRequestDispatcher("/bookBaseSystem.jsp").forward(req, resp);

    }
}
