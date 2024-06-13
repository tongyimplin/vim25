package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QuiesceDatastoreIOForHAFailed;
import com.vmware.vim25.ResourceInUse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuiesceDatastoreIOForHAFailed", propOrder = {"host", "hostName", "ds", "dsName"})
public class QuiesceDatastoreIOForHAFailed extends ResourceInUse {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference ds;
  
  @XmlElement(required = true)
  protected String dsName;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public ManagedObjectReference getDs() {
    return this.ds;
  }
  
  public void setDs(ManagedObjectReference paramManagedObjectReference) {
    this.ds = paramManagedObjectReference;
  }
  
  public String getDsName() {
    return this.dsName;
  }
  
  public void setDsName(String paramString) {
    this.dsName = paramString;
  }
}
