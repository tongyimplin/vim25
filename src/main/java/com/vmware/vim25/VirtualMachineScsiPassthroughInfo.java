package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineScsiPassthroughInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineScsiPassthroughInfo", propOrder = {"scsiClass", "vendor", "physicalUnitNumber"})
public class VirtualMachineScsiPassthroughInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected String scsiClass;
  
  @XmlElement(required = true)
  protected String vendor;
  
  protected int physicalUnitNumber;
  
  public String getScsiClass() {
    return this.scsiClass;
  }
  
  public void setScsiClass(String paramString) {
    this.scsiClass = paramString;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public int getPhysicalUnitNumber() {
    return this.physicalUnitNumber;
  }
  
  public void setPhysicalUnitNumber(int paramInt) {
    this.physicalUnitNumber = paramInt;
  }
}
