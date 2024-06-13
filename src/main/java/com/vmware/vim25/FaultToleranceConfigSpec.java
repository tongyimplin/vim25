package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigSpec;
import com.vmware.vim25.FaultToleranceMetaSpec;
import com.vmware.vim25.FaultToleranceVMConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceConfigSpec", propOrder = {"metaDataPath", "secondaryVmSpec"})
public class FaultToleranceConfigSpec extends DynamicData {
  protected FaultToleranceMetaSpec metaDataPath;
  
  protected FaultToleranceVMConfigSpec secondaryVmSpec;
  
  public FaultToleranceMetaSpec getMetaDataPath() {
    return this.metaDataPath;
  }
  
  public void setMetaDataPath(FaultToleranceMetaSpec paramFaultToleranceMetaSpec) {
    this.metaDataPath = paramFaultToleranceMetaSpec;
  }
  
  public FaultToleranceVMConfigSpec getSecondaryVmSpec() {
    return this.secondaryVmSpec;
  }
  
  public void setSecondaryVmSpec(FaultToleranceVMConfigSpec paramFaultToleranceVMConfigSpec) {
    this.secondaryVmSpec = paramFaultToleranceVMConfigSpec;
  }
}
