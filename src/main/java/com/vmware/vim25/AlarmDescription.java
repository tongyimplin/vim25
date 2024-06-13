package com.vmware.vim25;

import com.vmware.vim25.AlarmDescription;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.TypeDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmDescription", propOrder = {"expr", "stateOperator", "metricOperator", "hostSystemConnectionState", "virtualMachinePowerState", "datastoreConnectionState", "hostSystemPowerState", "virtualMachineGuestHeartbeatStatus", "entityStatus", "action"})
public class AlarmDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<TypeDescription> expr;
  
  @XmlElement(required = true)
  protected List<ElementDescription> stateOperator;
  
  @XmlElement(required = true)
  protected List<ElementDescription> metricOperator;
  
  @XmlElement(required = true)
  protected List<ElementDescription> hostSystemConnectionState;
  
  @XmlElement(required = true)
  protected List<ElementDescription> virtualMachinePowerState;
  
  protected List<ElementDescription> datastoreConnectionState;
  
  protected List<ElementDescription> hostSystemPowerState;
  
  protected List<ElementDescription> virtualMachineGuestHeartbeatStatus;
  
  @XmlElement(required = true)
  protected List<ElementDescription> entityStatus;
  
  @XmlElement(required = true)
  protected List<TypeDescription> action;
  
  public List<TypeDescription> getExpr() {
    if (this.expr == null)
      this.expr = new ArrayList<>(); 
    return this.expr;
  }
  
  public List<ElementDescription> getStateOperator() {
    if (this.stateOperator == null)
      this.stateOperator = new ArrayList<>(); 
    return this.stateOperator;
  }
  
  public List<ElementDescription> getMetricOperator() {
    if (this.metricOperator == null)
      this.metricOperator = new ArrayList<>(); 
    return this.metricOperator;
  }
  
  public List<ElementDescription> getHostSystemConnectionState() {
    if (this.hostSystemConnectionState == null)
      this.hostSystemConnectionState = new ArrayList<>(); 
    return this.hostSystemConnectionState;
  }
  
  public List<ElementDescription> getVirtualMachinePowerState() {
    if (this.virtualMachinePowerState == null)
      this.virtualMachinePowerState = new ArrayList<>(); 
    return this.virtualMachinePowerState;
  }
  
  public List<ElementDescription> getDatastoreConnectionState() {
    if (this.datastoreConnectionState == null)
      this.datastoreConnectionState = new ArrayList<>(); 
    return this.datastoreConnectionState;
  }
  
  public List<ElementDescription> getHostSystemPowerState() {
    if (this.hostSystemPowerState == null)
      this.hostSystemPowerState = new ArrayList<>(); 
    return this.hostSystemPowerState;
  }
  
  public List<ElementDescription> getVirtualMachineGuestHeartbeatStatus() {
    if (this.virtualMachineGuestHeartbeatStatus == null)
      this.virtualMachineGuestHeartbeatStatus = new ArrayList<>(); 
    return this.virtualMachineGuestHeartbeatStatus;
  }
  
  public List<ElementDescription> getEntityStatus() {
    if (this.entityStatus == null)
      this.entityStatus = new ArrayList<>(); 
    return this.entityStatus;
  }
  
  public List<TypeDescription> getAction() {
    if (this.action == null)
      this.action = new ArrayList<>(); 
    return this.action;
  }
}
