package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.SharesLevel;
import com.vmware.vim25.SharesOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesOption", propOrder = {"sharesOption", "defaultLevel"})
public class SharesOption extends DynamicData {
  @XmlElement(required = true)
  protected IntOption sharesOption;
  
  @XmlElement(required = true)
  protected SharesLevel defaultLevel;
  
  public IntOption getSharesOption() {
    return this.sharesOption;
  }
  
  public void setSharesOption(IntOption paramIntOption) {
    this.sharesOption = paramIntOption;
  }
  
  public SharesLevel getDefaultLevel() {
    return this.defaultLevel;
  }
  
  public void setDefaultLevel(SharesLevel paramSharesLevel) {
    this.defaultLevel = paramSharesLevel;
  }
}
