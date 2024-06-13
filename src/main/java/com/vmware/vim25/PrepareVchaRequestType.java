package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PrepareVchaRequestType;
import com.vmware.vim25.VchaClusterNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareVchaRequestType", propOrder = {"_this", "networkSpec"})
public class PrepareVchaRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VchaClusterNetworkSpec networkSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VchaClusterNetworkSpec getNetworkSpec() {
    return this.networkSpec;
  }
  
  public void setNetworkSpec(VchaClusterNetworkSpec paramVchaClusterNetworkSpec) {
    this.networkSpec = paramVchaClusterNetworkSpec;
  }
}
