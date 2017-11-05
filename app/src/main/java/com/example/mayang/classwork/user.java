package com.example.mayang.classwork;


import java.io.Serializable;

public class user implements Serializable{
    private String username;
    private String password;
    private String email;
    private String phone;
    private String avatar;          //头像
    private String name;
    private String sex;
    private String birth;
    private String bio;            //个人简历
    private String address;
    private boolean state;       //状态
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return  email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getAvatar(){
        return avatar;
    }
    public void setAvatar(String avatar){
        this.avatar=avatar;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getBirth(){
        return birth;
    }
    public void setBirth(String birth){
        this.birth=birth;
    }
    public String getBio(){
        return bio;
    }
    public  void setBio(String bio){
        this.bio=bio;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public boolean getState(){
        return state;
    }
    public void  setState(boolean state){
        this.state=state;
    }
}
