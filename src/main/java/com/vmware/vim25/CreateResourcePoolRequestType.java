package com.vmware.vim25;

import com.vmware.vim25.CreateResourcePoolRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateResourcePoolRequestType", propOrder = {"_this", "name", "spec"})
public class CreateResourcePoolRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ResourceConfigSpec spec;
  
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
  
  public ResourceConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ResourceConfigSpec paramResourceConfigSpec) {
    this.spec = paramResourceConfigSpec;
  }
}
