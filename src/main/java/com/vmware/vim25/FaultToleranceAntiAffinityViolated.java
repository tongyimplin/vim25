package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceAntiAffinityViolated;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceAntiAffinityViolated", propOrder = {"hostName", "host"})
public class FaultToleranceAntiAffinityViolated extends MigrationFault {
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
