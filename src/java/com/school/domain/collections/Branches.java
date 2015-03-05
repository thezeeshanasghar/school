/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.domain.collections;

import com.school.domain.Branch;
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
@XmlRootElement(name = "branches")
public class Branches
{
   protected Collection<Branch> branches = new ArrayList<Branch>();

   @XmlElementRef
   public Collection<Branch> getBranches()
   {
      return branches;
   }

   public void setBranches(Collection<Branch> branches)
   {
      this.branches = branches;
   }

   
}

