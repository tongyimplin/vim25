package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestAliases;
import com.vmware.vim25.GuestAliases;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestAliases", propOrder = {"guestAliases"})
public class ArrayOfGuestAliases {
  @XmlElement(name = "GuestAliases")
  protected List<GuestAliases> guestAliases;
  
  public List<GuestAliases> getGuestAliases() {
    if (this.guestAliases == null)
      this.guestAliases = new ArrayList<>(); 
    return this.guestAliases;
  }
}
