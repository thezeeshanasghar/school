package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name", "address", "contact", "rank", "created", "updated", "status"})
@XmlRootElement(name = "school")
//@XmlAccessorType(XmlAccessType.NONE)
@NamedQueries({
    @NamedQuery(name = "School.findAll", query = "SELECT s FROM School s"),
    @NamedQuery(name = "School.findById", query = "SELECT s FROM School s WHERE s.id = :id"),
    @NamedQuery(name = "School.findByName", query = "SELECT s FROM School s WHERE s.name = :name")})
public class School extends Model implements Serializable {

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "school")
    private List<Branch> branches;
    
    @OneToOne(optional = true, targetEntity = Address.class, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    protected Address address;

    @OneToOne(optional = true, targetEntity = Contact.class, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    protected Contact contact;

    public School() {

    }

    //    <editor-fold defaultstate="collapsed" desc="SetterGetter">
//    @XmlElementWrapper(name = "school-branch")
    @XmlTransient
    public List<Branch> getSchoolBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
    @XmlElement(name = "address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @XmlElement(name = "contact")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @XmlElement
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "School {"
                + super.toString()
                + ", name='" + name + '\''
                + '}';
    }
}
