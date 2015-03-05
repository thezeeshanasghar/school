package com.school.domain.core;

import com.school.domain.Address;
import com.school.domain.Contact;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;

@MappedSuperclass
public abstract class Person extends Model implements Serializable {

    @XmlElement(name = "first-name")
    @Column(nullable = false)
    private String firstName;

    @XmlElement(name = "last-name")
    @Column(nullable = false)
    private String lastName;

    @OneToOne(optional = true, targetEntity = Address.class)
    private Address address;

    @OneToOne(optional = true, targetEntity = Contact.class)
    private Contact contactDetail;

    public Person() {

    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Contact getContactDetail() {
        return this.contactDetail;
    }
    
    public void setContactDetail(Contact contactDetail) {
        this.contactDetail = contactDetail;
    }
//</editor-fold>
}
