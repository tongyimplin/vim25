package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SharesInfo;
import com.vmware.vim25.SharesLevel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesInfo", propOrder = {"shares", "level"})
public class SharesInfo extends DynamicData {
  protected int shares;
  
  @XmlElement(required = true)
  protected SharesLevel level;
  
  public int getShares() {
    return this.shares;
  }
  
  public void setShares(int paramInt) {
    this.shares = paramInt;
  }
  
  public SharesLevel getLevel() {
    return this.level;
  }
  
  public void setLevel(SharesLevel paramSharesLevel) {
    this.level = paramSharesLevel;
  }
}
