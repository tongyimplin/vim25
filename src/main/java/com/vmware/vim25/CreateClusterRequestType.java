package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpec;
import com.vmware.vim25.CreateClusterRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClusterRequestType", propOrder = {"_this", "name", "spec"})
public class CreateClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ClusterConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ClusterConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ClusterConfigSpec paramClusterConfigSpec) {
    this.spec = paramClusterConfigSpec;
  }
}
