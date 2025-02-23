package com.huanhuaxixuan.MYSQL.Service;

import com.huanhuaxixuan.MYSQL.Mapper.bookMapper;
import com.huanhuaxixuan.prjo.Book;
import com.huanhuaxixuan.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/24&2:12
 */
public class bookIMP {
    private SqlSessionFactory factory = new SqlSessionFactoryUtil().getSqlSessionFactory();

    public List<Book> selectAll() {
        SqlSession session = factory.openSession();
        List<Book> list = session.getMapper(bookMapper.class).selectAll();
        session.close();
        return list;
    }

    public void UpdateReaderByBookID(String id, String reader) {
        try (SqlSession session = factory.openSession(true)) {
            session.getMapper(bookMapper.class).UpdateReaderByBookID(id, reader);
            session.commit();
        } catch (Exception e) {
            // 异常处理逻辑，例如记录日志、抛出自定义异常等
            e.printStackTrace();
            System.out.println("错误");
        }
    }

    public void UpdateCancelReaderByBookID(String id, String reader) {
        try (SqlSession session = factory.openSession(true)) {
            session.getMapper(bookMapper.class).UpdateCancelReaderByBookID(id, reader);
            session.commit();
        } catch (Exception e) {
            // 异常处理逻辑，例如记录日志、抛出自定义异常等
            e.printStackTrace();
            System.out.println("错误");
        }
    }

    public List<Book> selectBookByID(String id) {
        SqlSession session = factory.openSession(true);
        List<Book> list = session.getMapper(bookMapper.class).selectBookByID(id);
        return list;
    }

    public void updateBook(Book book) {
        try (SqlSession session = factory.openSession(true)) {
            session.getMapper(bookMapper.class).updateBook(book);
            session.commit();
        } catch (Exception e) {
            // 异常处理逻辑，例如记录日志、抛出自定义异常等
            e.printStackTrace();
            System.out.println("错误");
        }
    }

    public void insertBook(Book book) {
        SqlSession session = factory.openSession(true);
        session.commit();
        session.getMapper(bookMapper.class).insertBook(book);
        session.close();
    }

    public void deleteBookByBookID(int id) {
        SqlSession session = factory.openSession(true);
        session.commit();
        session.getMapper(bookMapper.class).deleteBookByBookID(id);
        session.close();
    }
}
