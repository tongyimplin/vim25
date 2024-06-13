package com.vmware.vim25;

import com.vmware.vim25.DrsVmotionIncompatibleFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrsVmotionIncompatibleFault", propOrder = {"host"})
public class DrsVmotionIncompatibleFault extends VirtualHardwareCompatibilityIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
