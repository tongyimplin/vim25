package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAssignableHardwareBinding;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAssignableHardwareBinding", propOrder = {"instanceId", "vm"})
public class HostAssignableHardwareBinding extends DynamicData {
  @XmlElement(required = true)
  protected String instanceId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  public String getInstanceId() {
    return this.instanceId;
  }
  
  public void setInstanceId(String paramString) {
    this.instanceId = paramString;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
}
