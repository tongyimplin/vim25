package com.vmware.vim25;

import com.vmware.vim25.CreateSnapshotExRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineGuestQuiesceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSnapshotExRequestType", propOrder = {"_this", "name", "description", "memory", "quiesceSpec"})
public class CreateSnapshotExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected String description;
  
  protected boolean memory;
  
  protected VirtualMachineGuestQuiesceSpec quiesceSpec;
  
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
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean isMemory() {
    return this.memory;
  }
  
  public void setMemory(boolean paramBoolean) {
    this.memory = paramBoolean;
  }
  
  public VirtualMachineGuestQuiesceSpec getQuiesceSpec() {
    return this.quiesceSpec;
  }
  
  public void setQuiesceSpec(VirtualMachineGuestQuiesceSpec paramVirtualMachineGuestQuiesceSpec) {
    this.quiesceSpec = paramVirtualMachineGuestQuiesceSpec;
  }
}
