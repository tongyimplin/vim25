package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplicationFault;
import com.vmware.vim25.ReplicationVmFault;
import com.vmware.vim25.ReplicationVmInProgressFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationVmFault", propOrder = {"reason", "state", "instanceId", "vm"})
@XmlSeeAlso({ReplicationVmInProgressFault.class})
public class ReplicationVmFault extends ReplicationFault {
  @XmlElement(required = true)
  protected String reason;
  
  protected String state;
  
  protected String instanceId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
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
