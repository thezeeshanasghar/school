package com.school.domain;

import com.school.domain.core.Employee;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Teacher extends Employee implements Serializable {

    private String type;//Primary or Secondary

    public Teacher() {

    }
//<editor-fold defaultstate="collapsed" desc="SetterGetter">
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    
//</editor-fold>

}
