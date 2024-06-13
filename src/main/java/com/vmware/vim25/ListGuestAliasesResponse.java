package com.vmware.vim25;

import com.vmware.vim25.GuestAliases;
import com.vmware.vim25.ListGuestAliasesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListGuestAliasesResponse")
public class ListGuestAliasesResponse {
  protected List<GuestAliases> returnval;
  
  public List<GuestAliases> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
