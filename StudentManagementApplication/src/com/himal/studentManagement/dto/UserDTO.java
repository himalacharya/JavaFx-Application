package com.himal.studentManagement.dto;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public class UserDTO {
    private String userName;
    private int id;
    private String password;
    private String contact;

    public UserDTO(){

    }

    public UserDTO(String userName, int id, String password, String contact) {
        this.userName = userName;
        this.id = id;
        this.password = password;
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
