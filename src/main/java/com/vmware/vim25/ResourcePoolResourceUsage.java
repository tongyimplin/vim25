package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourcePoolResourceUsage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolResourceUsage", propOrder = {"reservationUsed", "reservationUsedForVm", "unreservedForPool", "unreservedForVm", "overallUsage", "maxUsage"})
public class ResourcePoolResourceUsage extends DynamicData {
  protected long reservationUsed;
  
  protected long reservationUsedForVm;
  
  protected long unreservedForPool;
  
  protected long unreservedForVm;
  
  protected long overallUsage;
  
  protected long maxUsage;
  
  public long getReservationUsed() {
    return this.reservationUsed;
  }
  
  public void setReservationUsed(long paramLong) {
    this.reservationUsed = paramLong;
  }
  
  public long getReservationUsedForVm() {
    return this.reservationUsedForVm;
  }
  
  public void setReservationUsedForVm(long paramLong) {
    this.reservationUsedForVm = paramLong;
  }
  
  public long getUnreservedForPool() {
    return this.unreservedForPool;
  }
  
  public void setUnreservedForPool(long paramLong) {
    this.unreservedForPool = paramLong;
  }
  
  public long getUnreservedForVm() {
    return this.unreservedForVm;
  }
  
  public void setUnreservedForVm(long paramLong) {
    this.unreservedForVm = paramLong;
  }
  
  public long getOverallUsage() {
    return this.overallUsage;
  }
  
  public void setOverallUsage(long paramLong) {
    this.overallUsage = paramLong;
  }
  
  public long getMaxUsage() {
    return this.maxUsage;
  }
  
  public void setMaxUsage(long paramLong) {
    this.maxUsage = paramLong;
  }
}
