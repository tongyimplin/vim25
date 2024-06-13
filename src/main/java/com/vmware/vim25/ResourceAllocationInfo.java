package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourceAllocationInfo;
import com.vmware.vim25.SharesInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAllocationInfo", propOrder = {"reservation", "expandableReservation", "limit", "shares", "overheadLimit"})
public class ResourceAllocationInfo extends DynamicData {
  protected Long reservation;
  
  protected Boolean expandableReservation;
  
  protected Long limit;
  
  protected SharesInfo shares;
  
  protected Long overheadLimit;
  
  public Long getReservation() {
    return this.reservation;
  }
  
  public void setReservation(Long paramLong) {
    this.reservation = paramLong;
  }
  
  public Boolean isExpandableReservation() {
    return this.expandableReservation;
  }
  
  public void setExpandableReservation(Boolean paramBoolean) {
    this.expandableReservation = paramBoolean;
  }
  
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
  
  public Long getOverheadLimit() {
    return this.overheadLimit;
  }
  
  public void setOverheadLimit(Long paramLong) {
    this.overheadLimit = paramLong;
  }
}
