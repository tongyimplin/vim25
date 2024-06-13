package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueSpec;
import com.vmware.vim25.ListRegistryValuesInGuestResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListRegistryValuesInGuestResponse")
public class ListRegistryValuesInGuestResponse {
  protected List<GuestRegValueSpec> returnval;
  
  public List<GuestRegValueSpec> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
