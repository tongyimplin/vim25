package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SharesInfo;
import com.vmware.vim25.VirtualEthernetCardResourceAllocation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardResourceAllocation", propOrder = {"reservation", "share", "limit"})
public class VirtualEthernetCardResourceAllocation extends DynamicData {
  protected Long reservation;
  
  @XmlElement(required = true)
  protected SharesInfo share;
  
  protected Long limit;
  
  public Long getReservation() {
    return this.reservation;
  }
  
  public void setReservation(Long paramLong) {
    this.reservation = paramLong;
  }
  
  public SharesInfo getShare() {
    return this.share;
  }
  
  public void setShare(SharesInfo paramSharesInfo) {
    this.share = paramSharesInfo;
  }
  
  public Long getLimit() {
    return this.limit;
  }
  
  public void setLimit(Long paramLong) {
    this.limit = paramLong;
  }
}
