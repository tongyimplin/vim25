package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourceAllocationOption;
import com.vmware.vim25.SharesOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAllocationOption", propOrder = {"sharesOption"})
public class ResourceAllocationOption extends DynamicData {
  @XmlElement(required = true)
  protected SharesOption sharesOption;
  
  public SharesOption getSharesOption() {
    return this.sharesOption;
  }
  
  public void setSharesOption(SharesOption paramSharesOption) {
    this.sharesOption = paramSharesOption;
  }
}
