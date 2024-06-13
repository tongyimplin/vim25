package com.vmware.vim25;

import com.vmware.vim25.CheckRelocateRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRelocateRequestType", propOrder = {"_this", "vm", "spec", "testType"})
public class CheckRelocateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec spec;
  
  protected List<String> testType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public VirtualMachineRelocateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.spec = paramVirtualMachineRelocateSpec;
  }
  
  public List<String> getTestType() {
    if (this.testType == null)
      this.testType = new ArrayList<>(); 
    return this.testType;
  }
}
