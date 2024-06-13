package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.UnlicensedVirtualMachinesFoundEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlicensedVirtualMachinesFoundEvent", propOrder = {"available"})
public class UnlicensedVirtualMachinesFoundEvent extends LicenseEvent {
  protected int available;
  
  public int getAvailable() {
    return this.available;
  }
  
  public void setAvailable(int paramInt) {
    this.available = paramInt;
  }
}
