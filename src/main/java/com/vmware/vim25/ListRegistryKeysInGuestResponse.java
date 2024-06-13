package com.vmware.vim25;

import com.vmware.vim25.GuestRegKeyRecordSpec;
import com.vmware.vim25.ListRegistryKeysInGuestResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListRegistryKeysInGuestResponse")
public class ListRegistryKeysInGuestResponse {
  protected List<GuestRegKeyRecordSpec> returnval;
  
  public List<GuestRegKeyRecordSpec> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
