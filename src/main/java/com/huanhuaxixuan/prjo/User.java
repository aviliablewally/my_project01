package com.huanhuaxixuan.prjo;

/**
 * @author 浣花溪轩
 * @date 2024/2/21&23:11
 */
public class User {
    private int id;
    private String account;         //用户账号
    private String password;        //用户密码
    private String email;           //邮箱地址
    private String cardID;          //用户身份

    public User() {
    }

    public User(int id, String account, String password, String email, String cardID) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.email = email;
        this.cardID = cardID;
    }
    public User( String account, String password, String email) {
        this.account = account;
        this.password = password;
        this.email = email;
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
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return cardID
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * 设置
     * @param cardID
     */
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String toString() {
        return "user{id = " + id + ", account = " + account + ", password = " + password + ", email = " + email + ", cardID = " + cardID + "}";
    }
}
