/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne; 
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Prakas
 */
@Entity
@Table(name = "tbl_complain")

public class Complain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "complain_id")
    private Integer complainId;

    @Column(name = "subject")
    private String subject;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "complain_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date complainDate;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private ComplainStatus status;
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @ManyToOne(optional = false)
    private Department department;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complainId")
    private List<CustomerComplainStatus> customerComplainStatusList;

    public Complain() {
    }

    public Complain(Integer complainId) {
        this.complainId = complainId;
    }

    public Complain(Integer complainId, String subject, String description, Date complainDate) {
        this.complainId = complainId;
        this.subject = subject;
        this.description = description;
        this.complainDate = complainDate;
    }

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(Date complainDate) {
        this.complainDate = complainDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ComplainStatus getStatus() {
        return status;
    }

    public void setStatus(ComplainStatus status) {
        this.status = status;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
        hash += (complainId != null ? complainId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Complain)) {
            return false;
        }
        Complain other = (Complain) object;
        if ((this.complainId == null && other.complainId != null) || (this.complainId != null && !this.complainId.equals(other.complainId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prakas.core.entity.Complain[ complainId=" + complainId + " ]";
    }
    
}
