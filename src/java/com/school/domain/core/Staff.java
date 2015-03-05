package com.school.domain.core;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Staff extends Employee implements Serializable {

    public Staff(){

    }
}

