package com.himal.studentManagement.dao.impl;

import com.himal.studentManagement.dao.UserDAO;
import com.himal.studentManagement.dto.UserDTO;
import com.himal.studentManagement.util.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public class UserDAOImpl implements UserDAO {


    PreparedStatement ps=null;



    @Override
    public int save(UserDTO userDTO) {
        int savedUser=0;
        String sql="INSERT into registration (id,userName,password,Contact) values(?,?,?,?)";
        try {
            ps= DBConnection.getConnection().prepareStatement(sql);
            ps.setInt(1,userDTO.getId());
            ps.setString(2,userDTO.getUserName());
            ps.setString(3,userDTO.getPassword());
            ps.setString(4,userDTO.getContact());
            ps.executeUpdate();
            return 1;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 1;



    }

    @Override
    public int update(UserDTO userDTO) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public UserDTO getById(int id) {
        return null;
    }

    @Override
    public ObservableList<UserDTO> getAll() {
        ObservableList<UserDTO> userDTOList=FXCollections.observableArrayList();

       String listQuery="Select * from registration";
        try {
            ps= DBConnection.getConnection().prepareStatement(listQuery);

            ResultSet rs=ps.executeQuery(listQuery);

            while (rs.next()){
                UserDTO userDTO=new UserDTO();
                userDTO.setId(rs.getInt("id"));
                userDTO.setUserName(rs.getString("userName"));
                userDTO.setPassword(rs.getString("password"));
                userDTO.setContact(rs.getString(4));
                userDTOList.add(userDTO);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return userDTOList;
    }

    @Override
    public List<UserDTO> search(String param) {
        return null;
    }
}
