package com.vmware.vim25;

import com.vmware.vim25.DisallowedOperationOnFailoverHost;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisallowedOperationOnFailoverHost", propOrder = {"host", "hostname"})
public class DisallowedOperationOnFailoverHost extends RuntimeFault {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String hostname;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
}
