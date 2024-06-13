package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ServiceConsoleReservationInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConsoleReservationInfo", propOrder = {"serviceConsoleReservedCfg", "serviceConsoleReserved", "unreserved"})
public class ServiceConsoleReservationInfo extends DynamicData {
  protected long serviceConsoleReservedCfg;
  
  protected long serviceConsoleReserved;
  
  protected long unreserved;
  
  public long getServiceConsoleReservedCfg() {
    return this.serviceConsoleReservedCfg;
  }
  
  public void setServiceConsoleReservedCfg(long paramLong) {
    this.serviceConsoleReservedCfg = paramLong;
  }
  
  public long getServiceConsoleReserved() {
    return this.serviceConsoleReserved;
  }
  
  public void setServiceConsoleReserved(long paramLong) {
    this.serviceConsoleReserved = paramLong;
  }
  
  public long getUnreserved() {
    return this.unreserved;
  }
  
  public void setUnreserved(long paramLong) {
    this.unreserved = paramLong;
  }
}
