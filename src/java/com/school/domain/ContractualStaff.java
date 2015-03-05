package com.school.domain;

import com.school.domain.core.Staff;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public  class ContractualStaff extends Staff implements Serializable {

    public ContractualStaff(){

    }
}

