package com.vmware.vim25;

import com.vmware.vim25.CloneVMRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineCloneSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloneVMRequestType", propOrder = {"_this", "folder", "name", "spec"})
public class CloneVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference folder;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected VirtualMachineCloneSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public VirtualMachineCloneSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VirtualMachineCloneSpec paramVirtualMachineCloneSpec) {
    this.spec = paramVirtualMachineCloneSpec;
  }
}
