package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlType(name = "", propOrder = {"code", "name", "forMale", "forFemale", "address", "contact","school", "rank", "created", "updated", "status"})
@XmlRootElement(name = "branch")
//@XmlType(name = "", propOrder = {"name", "address", "contact", "rank", "created", "updated", "status","links"})
//@XmlRootElement(name = "school")
//@XmlAccessorType(XmlAccessType.NONE)
@NamedQueries({
    @NamedQuery(name = "Branch.findAll", query = "SELECT a FROM Branch a"),
    @NamedQuery(name = "Branch.findById", query = "SELECT a FROM Branch a WHERE a.id = :id")})
public class Branch extends Model implements Serializable {

    @Column(unique = true, nullable = true)
    private String code;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private boolean forMale;

    @Column(nullable = false)
    private boolean forFemale;


    @OneToOne(optional = true, targetEntity = Address.class)
    private Address address;

    @OneToOne(optional = true, targetEntity = Contact.class)
    private Contact contact;

    @ManyToOne
    private School school;

    @OneToMany(targetEntity = Classs.class, mappedBy = "branch")
    private List<Classs> classes;

    public Branch() {

    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">
    @XmlElement
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
     @XmlElement
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "school")
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @XmlElement
    public boolean isForMale() {
        return this.forMale;
    }

    public void setForMale(boolean forMale) {
        this.forMale = forMale;
    }

    @XmlElement
    public boolean isForFemale() {
        return this.forFemale;
    }

    public void setForFemale(boolean forFemale) {
        this.forFemale = forFemale;
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

   
    @XmlTransient
    public List<Classs> getClasses() {
        return classes;
    }

    public void setClasses(List<Classs> classes) {
        this.classes = classes;
    }


//</editor-fold>

    @Override
    public String toString() {
        return "SchoolBranch{"
                + super.toString()
                + ", name='" + name + '\''
                + ", code='" + code + '\''
                + ", forMale='" + forMale + '\''
                + ", forFemale='" + forFemale + '\''
                + '}';
    }
}
