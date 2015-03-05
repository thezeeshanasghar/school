package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Cacheable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address",propOrder = {"street", "city", "state", "country", "zip", "rank", "created", "updated","status"})
//@XmlAccessorType(XmlAccessType.NONE)

@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findById", query = "SELECT a FROM Address a WHERE a.id = :id")})
public class Address extends Model implements Serializable {

    private String zip;
    private String country;
    private String city;
    private String street;
    private String state;
   

    public Address() {

    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">

    @XmlElement
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @XmlElement
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
   
//</editor-fold>
    @Override
    public String toString() {
        return "Address{"
                + super.toString()
                + ", street='" + street + '\''
                + ", city='" + city + '\''
                + ", state='" + state + '\''
                + ", country='" + country + '\''
                + ", zip='" + zip + '\''
                + '}';
    }
}
//    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
