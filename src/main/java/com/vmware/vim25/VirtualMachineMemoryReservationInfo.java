package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMemoryReservationInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMemoryReservationInfo", propOrder = {"virtualMachineMin", "virtualMachineMax", "virtualMachineReserved", "allocationPolicy"})
public class VirtualMachineMemoryReservationInfo extends DynamicData {
  protected long virtualMachineMin;
  
  protected long virtualMachineMax;
  
  protected long virtualMachineReserved;
  
  @XmlElement(required = true)
  protected String allocationPolicy;
  
  public long getVirtualMachineMin() {
    return this.virtualMachineMin;
  }
  
  public void setVirtualMachineMin(long paramLong) {
    this.virtualMachineMin = paramLong;
  }
  
  public long getVirtualMachineMax() {
    return this.virtualMachineMax;
  }
  
  public void setVirtualMachineMax(long paramLong) {
    this.virtualMachineMax = paramLong;
  }
  
  public long getVirtualMachineReserved() {
    return this.virtualMachineReserved;
  }
  
  public void setVirtualMachineReserved(long paramLong) {
    this.virtualMachineReserved = paramLong;
  }
  
  public String getAllocationPolicy() {
    return this.allocationPolicy;
  }
  
  public void setAllocationPolicy(String paramString) {
    this.allocationPolicy = paramString;
  }
}
