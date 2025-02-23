package com.huanhuaxixuan.prjo;

/**
 * @author 浣花溪轩
 * @date 2024/2/19&17:09
 */
public class User1 {
    private String password;        //用户密码
    private String cardID;          //用户身份


    public User1() {
    }

    public User1(String password, String cardID) {
        this.password = password;
        this.cardID = cardID;
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
        return "User1{password = " + password + ", cardID = " + cardID + "}";
    }
}
