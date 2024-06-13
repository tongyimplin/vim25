package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.UnlicensedVirtualMachinesEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnlicensedVirtualMachinesEvent", propOrder = {"unlicensed", "available"})
public class UnlicensedVirtualMachinesEvent extends LicenseEvent {
  protected int unlicensed;
  
  protected int available;
  
  public int getUnlicensed() {
    return this.unlicensed;
  }
  
  public void setUnlicensed(int paramInt) {
    this.unlicensed = paramInt;
  }
  
  public int getAvailable() {
    return this.available;
  }
  
  public void setAvailable(int paramInt) {
    this.available = paramInt;
  }
}
