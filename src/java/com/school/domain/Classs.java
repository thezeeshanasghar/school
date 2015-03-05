package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public  class Classs extends Model implements Serializable {


    @OneToMany(targetEntity=Student.class,mappedBy="currentClass")
    private Collection<Student> students;
    
    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String sectionName;


    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String roomNumber;


    @Column(unique=true,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String name;


    @ManyToOne(optional=true,targetEntity=Branch.class)
    private Branch branch;
    
    
    @ManyToMany(mappedBy = "classs")
    private List<Subject> subjects;

    public Classs(){
    }
    
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">
    
    public List<Subject> getSubjects() {
        return subjects;
    }
    
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    
    public Collection<Student> getStudents() {
        return students;
    }
    
    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
    
    
    public String getSectionName() {
        return this.sectionName;
    }
    
    
    public void setSectionName (String sectionName) {
        this.sectionName = sectionName;
    }
    
    
    
    public String getRoomNumber() {
        return this.roomNumber;
    }
    
    
    public void setRoomNumber (String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    
    
    public String getName() {
        return this.name;
    }
    
    
    public void setName (String name) {
        this.name = name;
    }
    
    
    
    public Branch getSchoolBranch() {
        return this.branch;
    }
    
    
    public void setSchoolBranch (Branch schoolBranch) {
        this.branch = schoolBranch;
    }
//</editor-fold>
}

