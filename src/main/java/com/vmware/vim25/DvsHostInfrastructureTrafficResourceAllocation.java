package com.vmware.vim25;

import com.vmware.vim25.DvsHostInfrastructureTrafficResourceAllocation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SharesInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostInfrastructureTrafficResourceAllocation", propOrder = {"limit", "shares", "reservation"})
public class DvsHostInfrastructureTrafficResourceAllocation extends DynamicData {
  protected Long limit;
  
  protected SharesInfo shares;
  
  protected Long reservation;
  
  public Long getLimit() {
    return this.limit;
  }
  
  public void setLimit(Long paramLong) {
    this.limit = paramLong;
  }
  
  public SharesInfo getShares() {
    return this.shares;
  }
  
  public void setShares(SharesInfo paramSharesInfo) {
    this.shares = paramSharesInfo;
  }
  
  public Long getReservation() {
    return this.reservation;
  }
  
  public void setReservation(Long paramLong) {
    this.reservation = paramLong;
  }
}
