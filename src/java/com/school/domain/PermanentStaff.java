package com.school.domain;

import com.school.domain.core.Staff;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class PermanentStaff extends Staff implements Serializable {

    private String salary;

    public PermanentStaff() {

    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
//</editor-fold>
}
