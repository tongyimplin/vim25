package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.SharesOption;
import com.vmware.vim25.StorageIOAllocationOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageIOAllocationOption", propOrder = {"limitOption", "sharesOption"})
public class StorageIOAllocationOption extends DynamicData {
  @XmlElement(required = true)
  protected LongOption limitOption;
  
  @XmlElement(required = true)
  protected SharesOption sharesOption;
  
  public LongOption getLimitOption() {
    return this.limitOption;
  }
  
  public void setLimitOption(LongOption paramLongOption) {
    this.limitOption = paramLongOption;
  }
  
  public SharesOption getSharesOption() {
    return this.sharesOption;
  }
  
  public void setSharesOption(SharesOption paramSharesOption) {
    this.sharesOption = paramSharesOption;
  }
}
