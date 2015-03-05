package com.school.domain.core;

import com.school.domain.EmploymentPeriod;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Employee extends Person implements Serializable {

    @Embedded
    private EmploymentPeriod employmentPeriod;
    private String employeeNumber;

    public Employee() {

    }

//<editor-fold defaultstate="collapsed" desc="SetterGetter">
    public EmploymentPeriod getEmploymentPeriod() {
        return this.employmentPeriod;
    }
    
    public void setEmploymentPeriod(EmploymentPeriod employmentPeriod) {
        this.employmentPeriod = employmentPeriod;
    }
    
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
//</editor-fold>
}
