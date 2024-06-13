package com.vmware.vim25;

import com.vmware.vim25.DVSPolicy;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSPolicy", propOrder = {"autoPreInstallAllowed", "autoUpgradeAllowed", "partialUpgradeAllowed"})
public class DVSPolicy extends DynamicData {
  protected Boolean autoPreInstallAllowed;
  
  protected Boolean autoUpgradeAllowed;
  
  protected Boolean partialUpgradeAllowed;
  
  public Boolean isAutoPreInstallAllowed() {
    return this.autoPreInstallAllowed;
  }
  
  public void setAutoPreInstallAllowed(Boolean paramBoolean) {
    this.autoPreInstallAllowed = paramBoolean;
  }
  
  public Boolean isAutoUpgradeAllowed() {
    return this.autoUpgradeAllowed;
  }
  
  public void setAutoUpgradeAllowed(Boolean paramBoolean) {
    this.autoUpgradeAllowed = paramBoolean;
  }
  
  public Boolean isPartialUpgradeAllowed() {
    return this.partialUpgradeAllowed;
  }
  
  public void setPartialUpgradeAllowed(Boolean paramBoolean) {
    this.partialUpgradeAllowed = paramBoolean;
  }
}
