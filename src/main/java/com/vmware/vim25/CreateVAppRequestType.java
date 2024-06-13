package com.vmware.vim25;

import com.vmware.vim25.CreateVAppRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.VAppConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVAppRequestType", propOrder = {"_this", "name", "resSpec", "configSpec", "vmFolder"})
public class CreateVAppRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ResourceConfigSpec resSpec;
  
  @XmlElement(required = true)
  protected VAppConfigSpec configSpec;
  
  protected ManagedObjectReference vmFolder;
  
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
  
  public ResourceConfigSpec getResSpec() {
    return this.resSpec;
  }
  
  public void setResSpec(ResourceConfigSpec paramResourceConfigSpec) {
    this.resSpec = paramResourceConfigSpec;
  }
  
  public VAppConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VAppConfigSpec paramVAppConfigSpec) {
    this.configSpec = paramVAppConfigSpec;
  }
  
  public ManagedObjectReference getVmFolder() {
    return this.vmFolder;
  }
  
  public void setVmFolder(ManagedObjectReference paramManagedObjectReference) {
    this.vmFolder = paramManagedObjectReference;
  }
}
