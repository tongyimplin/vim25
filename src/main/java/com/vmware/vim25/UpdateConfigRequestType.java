package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.UpdateConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateConfigRequestType", propOrder = {"_this", "name", "config"})
public class UpdateConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String name;
  
  protected ResourceConfigSpec config;
  
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
  
  public ResourceConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(ResourceConfigSpec paramResourceConfigSpec) {
    this.config = paramResourceConfigSpec;
  }
}
