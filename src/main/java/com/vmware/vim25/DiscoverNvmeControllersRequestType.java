package com.vmware.vim25;

import com.vmware.vim25.DiscoverNvmeControllersRequestType;
import com.vmware.vim25.HostNvmeDiscoverSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoverNvmeControllersRequestType", propOrder = {"_this", "discoverSpec"})
public class DiscoverNvmeControllersRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostNvmeDiscoverSpec discoverSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostNvmeDiscoverSpec getDiscoverSpec() {
    return this.discoverSpec;
  }
  
  public void setDiscoverSpec(HostNvmeDiscoverSpec paramHostNvmeDiscoverSpec) {
    this.discoverSpec = paramHostNvmeDiscoverSpec;
  }
}
