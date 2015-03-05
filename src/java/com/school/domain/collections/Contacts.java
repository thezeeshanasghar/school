/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.domain.collections;

import com.school.domain.Contact;
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
@XmlRootElement(name = "contacts")
public class Contacts
{
   protected Collection<Contact> contacts = new ArrayList<Contact>();

   @XmlElementRef
   public Collection<Contact> getContacts()
   {
      return contacts;
   }

   public void setContacts(Collection<Contact> contacts)
   {
      this.contacts = contacts;
   }

   
}
