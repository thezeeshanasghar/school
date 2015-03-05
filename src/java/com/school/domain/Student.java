package com.school.domain;

import com.school.domain.core.Person;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Student extends Person implements Serializable {

    @ManyToOne(optional = true, targetEntity = ParentGuardian.class)
    private ParentGuardian parentGuardian;

    @Column(unique = true, nullable = false)
    private String rollNumber;

    @Column(unique = true, nullable = false)
    private Integer admissionNumber;

    @Temporal(TemporalType.DATE)
    private Date dob;
    
    @ManyToOne(targetEntity = Classs.class)
    private Classs currentClass;

    @OneToOne
    private Classs classAdmitted;

    @OneToOne
    private Classs classLeft;


    public Student() {

    }
//<editor-fold defaultstate="collapsed" desc="SetterGetter">
    
    public Classs getClassAdmitted() {
        return classAdmitted;
    }
    
    public void setClassAdmitted(Classs classAdmitted) {
        this.classAdmitted = classAdmitted;
    }
    
    public Classs getClassLeft() {
        return classLeft;
    }
    
    public void setClassLeft(Classs classLeft) {
        this.classLeft = classLeft;
    }
    
    public Integer getAdmissionNumber() {
        return admissionNumber;
    }
    
    public void setAdmissionNumber(Integer admissionNumber) {
        this.admissionNumber = admissionNumber;
    }
    
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public Classs getCurrentClass() {
        return currentClass;
    }
    
    public void setCurrentClass(Classs currentClass) {
        this.currentClass = currentClass;
    }
    
    public ParentGuardian getParentGuardian() {
        return this.parentGuardian;
    }
    
    public void setParentGuardian(ParentGuardian parentGuardian) {
        this.parentGuardian = parentGuardian;
    }
    
    public String getRollNumber() {
        return this.rollNumber;
    }
    
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
//</editor-fold>
}
