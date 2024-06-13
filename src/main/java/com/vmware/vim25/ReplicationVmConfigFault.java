package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplicationConfigFault;
import com.vmware.vim25.ReplicationVmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationVmConfigFault", propOrder = {"reason", "vmRef"})
public class ReplicationVmConfigFault extends ReplicationConfigFault {
  protected String reason;
  
  protected ManagedObjectReference vmRef;
  
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
}
