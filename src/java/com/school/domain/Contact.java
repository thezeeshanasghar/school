package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement
@XmlType(name="contact", propOrder = {"workNumber", "homeNumber", "cellNumber", "rank", "created", "updated","status"})
//@XmlAccessorType(XmlAccessType.NONE)
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT a FROM Contact a"),
    @NamedQuery(name = "Contact.findById", query = "SELECT a FROM Contact a WHERE a.id = :id")})
public class Contact extends Model implements Serializable {

//    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    private String workNumber;
    private String homeNumber;
    private String cellNumber;

    public Contact() {

    }

    //<editor-fold defaultstate="collapsed" desc="SetterGetter">
    @XmlElement(name = "work-number")
    public String getWorkNumber() {
        return this.workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
@XmlElement(name = "home-number")
    public String getHomeNumber() {
        return this.homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
@XmlElement(name = "cell-number")
    public String getCellNumber() {
        return this.cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
//</editor-fold>
     @Override
    public String toString() {
        return "ContactDetail{"
                + super.toString()
                + ", workNumber='" + workNumber + '\''
                + ", workNumber='" + workNumber + '\''
                + ", cellNumber='" + cellNumber + '\''
                + '}';
    }
}
