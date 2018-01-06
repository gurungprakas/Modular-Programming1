/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.core.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Prakas
 */
@Entity
@Table(name = "tbl_customer_complain_status")
@NamedQueries({
    @NamedQuery(name = "CustomerComplainStatus.findAll", query = "SELECT c FROM CustomerComplainStatus c")})
public class CustomerComplainStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "complain_status_id")
    private Integer complainStatusId;
    @Basic(optional = false)
    @Column(name = "status_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusUpdateDate;
    @Basic(optional = false)
    @Lob
    @Column(name = "remarks")
    private String remarks;
    @JoinColumn(name = "complain_id", referencedColumnName = "complain_id")
    @ManyToOne(optional = false)
    private Complain complainId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private ComplainStatus statusId;

    public CustomerComplainStatus() {
    }

    public CustomerComplainStatus(Integer complainStatusId) {
        this.complainStatusId = complainStatusId;
    }

    public CustomerComplainStatus(Integer complainStatusId, Date statusUpdateDate, String remarks) {
        this.complainStatusId = complainStatusId;
        this.statusUpdateDate = statusUpdateDate;
        this.remarks = remarks;
    }

    public Integer getComplainStatusId() {
        return complainStatusId;
    }

    public void setComplainStatusId(Integer complainStatusId) {
        this.complainStatusId = complainStatusId;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Complain getComplainId() {
        return complainId;
    }

    public void setComplainId(Complain complainId) {
        this.complainId = complainId;
    }

    public ComplainStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(ComplainStatus statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complainStatusId != null ? complainStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerComplainStatus)) {
            return false;
        }
        CustomerComplainStatus other = (CustomerComplainStatus) object;
        if ((this.complainStatusId == null && other.complainStatusId != null) || (this.complainStatusId != null && !this.complainStatusId.equals(other.complainStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prakas.core.entity.CustomerComplainStatus[ complainStatusId=" + complainStatusId + " ]";
    }
    
}
