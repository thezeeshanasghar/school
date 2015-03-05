package com.school.domain.core;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.annotations.AdditionalCriteria;
import org.eclipse.persistence.annotations.QueryRedirectors;

@MappedSuperclass
//@XmlRootElement
//@XmlType(propOrder = {"rank", "created","updated","status"})
@XmlTransient
@AdditionalCriteria("this.status <> 'deleted'")
@QueryRedirectors( delete=com.school.util.CustomDeleteRedirector.class)
public abstract class Model implements Serializable { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    
    private Integer rank;
    
    @Column(name = "status")
    @Basic
    private String status;
    
    
    public Model() {
        
    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">
    
    protected Date getCreated() {
        return this.created;
    }
    
    protected void setCreated(Date created) {
        this.created = created;
    }
       @XmlAttribute
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    @XmlElement
    protected Date getUpdated() {
        return this.updated;
    }
    
    protected void setUpdated(Date updated) {
        this.updated = updated;
    }
    
    protected void setRank(Integer rank) {
        this.rank = rank;
    }
    @XmlElement
    protected Integer getRank() {
        return rank;
    }

    protected String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
//</editor-fold>
    
    @PrePersist
    protected void onCreate() {
        updated = created = new Date();
        if (rank == null) {
            rank = 0;
        }
        if (status == null) {
            status = "live";
        }
    }
    
    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }
     @Override
    public String toString() {
        return 
                "id=" + id
                + ", rank='" + rank + '\''
                + ", created='" + created + '\''
                + ", updated='" + updated + '\''
                + ", status='" + status + '\'';
                
    }
}
