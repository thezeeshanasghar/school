package com.school.domain.collections;

import com.school.domain.Address;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@XmlRootElement(name = "addresses")
public class Addresses
{
   protected Collection<Address> addresses = new ArrayList<Address>();

   @XmlElementRef
   public Collection<Address> getAddresss()
   {
      return addresses;
   }

   public void setAddresss(Collection<Address> addresses)
   {
      this.addresses = addresses;
   }

 

}
