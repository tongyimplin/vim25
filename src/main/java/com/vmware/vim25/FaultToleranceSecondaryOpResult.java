package com.vmware.vim25;

import com.vmware.vim25.ClusterPowerOnVmResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceSecondaryOpResult;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceSecondaryOpResult", propOrder = {"vm", "powerOnAttempted", "powerOnResult"})
public class FaultToleranceSecondaryOpResult extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected boolean powerOnAttempted;
  
  protected ClusterPowerOnVmResult powerOnResult;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public boolean isPowerOnAttempted() {
    return this.powerOnAttempted;
  }
  
  public void setPowerOnAttempted(boolean paramBoolean) {
    this.powerOnAttempted = paramBoolean;
  }
  
  public ClusterPowerOnVmResult getPowerOnResult() {
    return this.powerOnResult;
  }
  
  public void setPowerOnResult(ClusterPowerOnVmResult paramClusterPowerOnVmResult) {
    this.powerOnResult = paramClusterPowerOnVmResult;
  }
}
