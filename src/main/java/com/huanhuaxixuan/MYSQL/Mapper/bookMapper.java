package com.huanhuaxixuan.MYSQL.Mapper;

import com.huanhuaxixuan.prjo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 浣花溪轩
 * @date 2024/2/24&2:06
 */
public interface bookMapper {
    List<Book> selectAll();

    void UpdateReaderByBookID(@Param("id") String id, @Param("reader") String reader);

    void UpdateCancelReaderByBookID(@Param("id") String id, @Param("reader") String reader);

    List<Book> selectBookByID(String id);

    void updateBook(Book book);

    void insertBook(Book book);

    void deleteBookByBookID(int id);
}
