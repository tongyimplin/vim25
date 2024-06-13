package com.vmware.vim25;

import com.vmware.vim25.ClusterAttemptedVmInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAttemptedVmInfo", propOrder = {"vm", "task"})
public class ClusterAttemptedVmInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference task;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getTask() {
    return this.task;
  }
  
  public void setTask(ManagedObjectReference paramManagedObjectReference) {
    this.task = paramManagedObjectReference;
  }
}
