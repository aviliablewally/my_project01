package com.huanhuaxixuan.prjo;

/**
 * @author 浣花溪轩
 * @date 2024/2/19&17:09
 */
public class Book {
    private int id;                           //书籍编号
    private String bookName;                    //书籍名字
    private String bookWriter;                   //书籍作者
    private String bookBrief;                    //书籍简介
    private String reader;                       //借阅者
    private String borrowingStatus;               //书籍状态：借阅状态


    public Book() {
    }

    public Book(int id, String bookName, String bookWriter, String bookBrief, String reader, String borrowingStatus) {
        this.id = id;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookBrief = bookBrief;
        this.reader = reader;
        this.borrowingStatus = borrowingStatus;
    }
    public Book(String bookName, String bookWriter, String bookBrief, String reader, String borrowingStatus) {
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookBrief = bookBrief;
        this.reader = reader;
        this.borrowingStatus = borrowingStatus;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 获取
     * @return bookWriter
     */
    public String getBookWriter() {
        return bookWriter;
    }

    /**
     * 设置
     * @param bookWriter
     */
    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    /**
     * 获取
     * @return bookBrief
     */
    public String getBookBrief() {
        return bookBrief;
    }

    /**
     * 设置
     * @param bookBrief
     */
    public void setBookBrief(String bookBrief) {
        this.bookBrief = bookBrief;
    }

    /**
     * 获取
     * @return reader
     */
    public String getReader() {
        return reader;
    }

    /**
     * 设置
     * @param reader
     */
    public void setReader(String reader) {
        this.reader = reader;
    }

    /**
     * 获取
     * @return borrowingStatus
     */
    public String getBorrowingStatus() {
        return borrowingStatus;
    }

    /**
     * 设置
     * @param borrowingStatus
     */
    public void setBorrowingStatus(String borrowingStatus) {
        this.borrowingStatus = borrowingStatus;
    }

    public String toString() {
        return "Book{id = " + id + ", bookName = " + bookName + ", bookWriter = " + bookWriter + ", bookBrief = " + bookBrief + ", reader = " + reader + ", borrowingStatus = " + borrowingStatus + "}";
    }
}
