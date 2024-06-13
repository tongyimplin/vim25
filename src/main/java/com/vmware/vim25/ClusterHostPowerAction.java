package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterHostPowerAction;
import com.vmware.vim25.HostPowerOperationType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterHostPowerAction", propOrder = {"operationType", "powerConsumptionWatt", "cpuCapacityMHz", "memCapacityMB"})
public class ClusterHostPowerAction extends ClusterAction {
  @XmlElement(required = true)
  protected HostPowerOperationType operationType;
  
  protected Integer powerConsumptionWatt;
  
  protected Integer cpuCapacityMHz;
  
  protected Integer memCapacityMB;
  
  public HostPowerOperationType getOperationType() {
    return this.operationType;
  }
  
  public void setOperationType(HostPowerOperationType paramHostPowerOperationType) {
    this.operationType = paramHostPowerOperationType;
  }
  
  public Integer getPowerConsumptionWatt() {
    return this.powerConsumptionWatt;
  }
  
  public void setPowerConsumptionWatt(Integer paramInteger) {
    this.powerConsumptionWatt = paramInteger;
  }
  
  public Integer getCpuCapacityMHz() {
    return this.cpuCapacityMHz;
  }
  
  public void setCpuCapacityMHz(Integer paramInteger) {
    this.cpuCapacityMHz = paramInteger;
  }
  
  public Integer getMemCapacityMB() {
    return this.memCapacityMB;
  }
  
  public void setMemCapacityMB(Integer paramInteger) {
    this.memCapacityMB = paramInteger;
  }
}
