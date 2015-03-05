/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.domain.collections;

import com.school.domain.School;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Zeeshan
 */
@XmlRootElement(name = "schools")
public class Schools
{
   protected Collection<School> schools = new ArrayList<School>();

   @XmlElementRef
   public Collection<School> getSchools()
   {
      return schools;
   }

   public void setSchools(Collection<School> schools)
   {
      this.schools = schools;
   }

   

}

