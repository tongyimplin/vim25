package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpgradeToolsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeToolsRequestType", propOrder = {"_this", "installerOptions"})
public class UpgradeToolsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String installerOptions;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getInstallerOptions() {
    return this.installerOptions;
  }
  
  public void setInstallerOptions(String paramString) {
    this.installerOptions = paramString;
  }
}
