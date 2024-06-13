package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMemoryReservationSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMemoryReservationSpec", propOrder = {"virtualMachineReserved", "allocationPolicy"})
public class VirtualMachineMemoryReservationSpec extends DynamicData {
  protected Long virtualMachineReserved;
  
  protected String allocationPolicy;
  
  public Long getVirtualMachineReserved() {
    return this.virtualMachineReserved;
  }
  
  public void setVirtualMachineReserved(Long paramLong) {
    this.virtualMachineReserved = paramLong;
  }
  
  public String getAllocationPolicy() {
    return this.allocationPolicy;
  }
  
  public void setAllocationPolicy(String paramString) {
    this.allocationPolicy = paramString;
  }
}
