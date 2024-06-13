package com.vmware.vim25;

import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineImportSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineImportSpec", propOrder = {"configSpec", "resPoolEntity"})
public class VirtualMachineImportSpec extends ImportSpec {
  @XmlElement(required = true)
  protected VirtualMachineConfigSpec configSpec;
  
  protected ManagedObjectReference resPoolEntity;
  
  public VirtualMachineConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.configSpec = paramVirtualMachineConfigSpec;
  }
  
  public ManagedObjectReference getResPoolEntity() {
    return this.resPoolEntity;
  }
  
  public void setResPoolEntity(ManagedObjectReference paramManagedObjectReference) {
    this.resPoolEntity = paramManagedObjectReference;
  }
}
