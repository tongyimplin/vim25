package com.vmware.vim25;

import com.vmware.vim25.ConfigureVchaRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VchaClusterConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configureVchaRequestType", propOrder = {"_this", "configSpec"})
public class ConfigureVchaRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VchaClusterConfigSpec configSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VchaClusterConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VchaClusterConfigSpec paramVchaClusterConfigSpec) {
    this.configSpec = paramVchaClusterConfigSpec;
  }
}
