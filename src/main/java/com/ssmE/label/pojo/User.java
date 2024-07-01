package com.ssmE.label.pojo;

public class User {

    private String name;
    private String password;
    private String email;
    private String phone;
    private String sex;
    private String address;
    private String birthday;
    private String id;
    private String role;
    private String status;
    private String createTime;
    private String updateTime;
    private String deleteTime;
    private String delete;
    private String remark;
    private String headImg;
    private String qq;
    private String wechat;
    private String weibo;
    private String github;



    //getter and setter


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
