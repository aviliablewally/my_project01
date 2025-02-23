package com.huanhuaxixuan.WEB;

import com.huanhuaxixuan.MYSQL.Service.User1IMP;
import com.huanhuaxixuan.MYSQL.Service.bookIMP;
import com.huanhuaxixuan.prjo.Book;
import com.huanhuaxixuan.util.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/24&2:16
 */
@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
    private bookIMP context = new ApplicationContextUtil().getAppLicationContextBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String rootName = req.getParameter("username");
        System.out.println(rootName);
        String cardID = req.getParameter("cardID");
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
        req.setAttribute("root", rootName);
        req.setAttribute("cardID",cardID);
        req.getRequestDispatcher("/bookBaseSystem.jsp").forward(req, resp);
    }


}
