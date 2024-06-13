package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVmfsRescanResult;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVmfsRescanResult", propOrder = {"host", "fault"})
public class HostVmfsRescanResult extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected LocalizedMethodFault fault;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
