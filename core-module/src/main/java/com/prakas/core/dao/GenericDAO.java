/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.core.dao;

import java.util.List;

/**
 *
 * @author Prakas
 * @param <T>
 */
public interface GenericDAO<T> {
    List<T> getAll();
    T getById(int id);
    void insert(T t);
    void delete(int id);
    void update(T t);
    
    
}
