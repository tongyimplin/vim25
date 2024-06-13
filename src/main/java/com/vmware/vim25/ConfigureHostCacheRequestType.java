package com.vmware.vim25;

import com.vmware.vim25.ConfigureHostCacheRequestType;
import com.vmware.vim25.HostCacheConfigurationSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureHostCacheRequestType", propOrder = {"_this", "spec"})
public class ConfigureHostCacheRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostCacheConfigurationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostCacheConfigurationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostCacheConfigurationSpec paramHostCacheConfigurationSpec) {
    this.spec = paramHostCacheConfigurationSpec;
  }
}
