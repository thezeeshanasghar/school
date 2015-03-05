/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.domain;

import com.school.domain.core.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Zeeshan
 */
@Entity
public class Subject extends Model implements Serializable {

    @Column(nullable = false)
    private String name;
    private String publisher;

    @ManyToMany
    private List<Classs> classs;

    public Subject() {
    }
    //<editor-fold defaultstate="collapsed" desc="SetterGetter">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classs> getClasss() {
        if (classs == null) {
            classs = new ArrayList<>();
        }
        return classs;
    }

    public void setClasss(List<Classs> classs) {
        this.classs = classs;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
//</editor-fold>
}
