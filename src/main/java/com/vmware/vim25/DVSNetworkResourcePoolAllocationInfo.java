package com.vmware.vim25;

import com.vmware.vim25.DVSNetworkResourcePoolAllocationInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SharesInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNetworkResourcePoolAllocationInfo", propOrder = {"limit", "shares", "priorityTag"})
public class DVSNetworkResourcePoolAllocationInfo extends DynamicData {
  protected Long limit;
  
  protected SharesInfo shares;
  
  protected Integer priorityTag;
  
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
  
  public Integer getPriorityTag() {
    return this.priorityTag;
  }
  
  public void setPriorityTag(Integer paramInteger) {
    this.priorityTag = paramInteger;
  }
}
