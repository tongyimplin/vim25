package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplicationConfigFault;
import com.vmware.vim25.ReplicationDiskConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationDiskConfigFault", propOrder = {"reason", "vmRef", "key"})
public class ReplicationDiskConfigFault extends ReplicationConfigFault {
  protected String reason;
  
  protected ManagedObjectReference vmRef;
  
  protected Integer key;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public ManagedObjectReference getVmRef() {
    return this.vmRef;
  }
  
  public void setVmRef(ManagedObjectReference paramManagedObjectReference) {
    this.vmRef = paramManagedObjectReference;
  }
  
  public Integer getKey() {
    return this.key;
  }
  
  public void setKey(Integer paramInteger) {
    this.key = paramInteger;
  }
}
