/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.core.dao;

import com.prakas.core.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Prakas
 */
@Repository(value = "customerDAO")
public interface CustomerDAO extends GenericDAO<Customer> {
    
}
