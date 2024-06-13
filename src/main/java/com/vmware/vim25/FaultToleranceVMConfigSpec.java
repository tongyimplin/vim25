package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceDiskSpec;
import com.vmware.vim25.FaultToleranceVMConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceVMConfigSpec", propOrder = {"vmConfig", "disks"})
public class FaultToleranceVMConfigSpec extends DynamicData {
  protected ManagedObjectReference vmConfig;
  
  protected List<FaultToleranceDiskSpec> disks;
  
  public ManagedObjectReference getVmConfig() {
    return this.vmConfig;
  }
  
  public void setVmConfig(ManagedObjectReference paramManagedObjectReference) {
    this.vmConfig = paramManagedObjectReference;
  }
  
  public List<FaultToleranceDiskSpec> getDisks() {
    if (this.disks == null)
      this.disks = new ArrayList<>(); 
    return this.disks;
  }
}
