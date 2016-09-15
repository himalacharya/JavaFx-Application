package com.himal.studentManagement.dao;

import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public interface GenericDAO<T> {

    int save(T t);
    int update(T t);
    int delete(int id);
    T getById(int id);
    List<T> getAll();
    List<T> search(String param);


}
