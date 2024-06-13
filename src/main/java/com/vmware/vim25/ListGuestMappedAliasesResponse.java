package com.vmware.vim25;

import com.vmware.vim25.GuestMappedAliases;
import com.vmware.vim25.ListGuestMappedAliasesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListGuestMappedAliasesResponse")
public class ListGuestMappedAliasesResponse {
  protected List<GuestMappedAliases> returnval;
  
  public List<GuestMappedAliases> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
