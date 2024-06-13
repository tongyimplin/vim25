package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineConfigInfoOverheadInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigInfoOverheadInfo", propOrder = {"initialMemoryReservation", "initialSwapReservation"})
public class VirtualMachineConfigInfoOverheadInfo extends DynamicData {
  protected Long initialMemoryReservation;
  
  protected Long initialSwapReservation;
  
  public Long getInitialMemoryReservation() {
    return this.initialMemoryReservation;
  }
  
  public void setInitialMemoryReservation(Long paramLong) {
    this.initialMemoryReservation = paramLong;
  }
  
  public Long getInitialSwapReservation() {
    return this.initialSwapReservation;
  }
  
  public void setInitialSwapReservation(Long paramLong) {
    this.initialSwapReservation = paramLong;
  }
}
