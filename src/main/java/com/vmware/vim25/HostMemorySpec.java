package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMemorySpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemorySpec", propOrder = {"serviceConsoleReservation"})
public class HostMemorySpec extends DynamicData {
  protected Long serviceConsoleReservation;
  
  public Long getServiceConsoleReservation() {
    return this.serviceConsoleReservation;
  }
  
  public void setServiceConsoleReservation(Long paramLong) {
    this.serviceConsoleReservation = paramLong;
  }
}
