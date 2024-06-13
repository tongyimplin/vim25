package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateClusterProfileRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClusterProfileRequestType", propOrder = {"_this", "config"})
public class UpdateClusterProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ClusterProfileConfigSpec config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ClusterProfileConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(ClusterProfileConfigSpec paramClusterProfileConfigSpec) {
    this.config = paramClusterProfileConfigSpec;
  }
}
