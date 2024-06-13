package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineRuntimeInfoDasProtectionState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRuntimeInfoDasProtectionState", propOrder = {"dasProtected"})
public class VirtualMachineRuntimeInfoDasProtectionState extends DynamicData {
  protected boolean dasProtected;
  
  public boolean isDasProtected() {
    return this.dasProtected;
  }
  
  public void setDasProtected(boolean paramBoolean) {
    this.dasProtected = paramBoolean;
  }
}
