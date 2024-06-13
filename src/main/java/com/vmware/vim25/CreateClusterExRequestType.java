package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.CreateClusterExRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClusterExRequestType", propOrder = {"_this", "name", "spec"})
public class CreateClusterExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ClusterConfigSpecEx spec;
  
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
  
  public ClusterConfigSpecEx getSpec() {
    return this.spec;
  }
  
  public void setSpec(ClusterConfigSpecEx paramClusterConfigSpecEx) {
    this.spec = paramClusterConfigSpecEx;
  }
}
