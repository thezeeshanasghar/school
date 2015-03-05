package com.school.domain;

import com.school.domain.core.Person;
import java.io.Serializable;

import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class ParentGuardian extends Person implements Serializable {

    @OneToMany(targetEntity = Student.class, mappedBy = "parentGuardian")
    private List<Student> childrens;

    private String relationShip;

    @Column(unique = true)
    private String CNIC;

    public ParentGuardian() {

    }
//<editor-fold defaultstate="collapsed" desc="SetterGetter">

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    @XmlTransient
    public List<Student> getChildrens() {
        return this.childrens;
    }

    public void setChildrens(List<Student> childrens) {
        this.childrens = childrens;
    }

    public String getRelationShip() {
        return this.relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }
//</editor-fold>
}
