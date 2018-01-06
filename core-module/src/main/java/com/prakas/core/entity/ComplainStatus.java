/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Prakas
 */
@Entity
@Table(name = "tbl_complain_status")
@NamedQueries({
    @NamedQuery(name = "ComplainStatus.findAll", query = "SELECT c FROM ComplainStatus c")})
public class ComplainStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<Complain> complainList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<CustomerComplainStatus> customerComplainStatusList;

    public ComplainStatus() {
    }

    public ComplainStatus(Integer statusId) {
        this.statusId = statusId;
    }

    public ComplainStatus(Integer statusId, String status, String color) {
        this.statusId = statusId;
        this.status = status;
        this.color = color;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Complain> getComplainList() {
        return complainList;
    }

    public void setComplainList(List<Complain> complainList) {
        this.complainList = complainList;
    }

    public List<CustomerComplainStatus> getCustomerComplainStatusList() {
        return customerComplainStatusList;
    }

    public void setCustomerComplainStatusList(List<CustomerComplainStatus> customerComplainStatusList) {
        this.customerComplainStatusList = customerComplainStatusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplainStatus)) {
            return false;
        }
        ComplainStatus other = (ComplainStatus) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prakas.core.entity.ComplainStatus[ statusId=" + statusId + " ]";
    }
    
}
