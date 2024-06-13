package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestMappedAliases;
import com.vmware.vim25.GuestMappedAliases;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestMappedAliases", propOrder = {"guestMappedAliases"})
public class ArrayOfGuestMappedAliases {
  @XmlElement(name = "GuestMappedAliases")
  protected List<GuestMappedAliases> guestMappedAliases;
  
  public List<GuestMappedAliases> getGuestMappedAliases() {
    if (this.guestMappedAliases == null)
      this.guestMappedAliases = new ArrayList<>(); 
    return this.guestMappedAliases;
  }
}
