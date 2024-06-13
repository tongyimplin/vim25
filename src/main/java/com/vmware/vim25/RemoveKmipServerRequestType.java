package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveKmipServerRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveKmipServerRequestType", propOrder = {"_this", "clusterId", "serverName"})
public class RemoveKmipServerRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  @XmlElement(required = true)
  protected String serverName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
  
  public String getServerName() {
    return this.serverName;
  }
  
  public void setServerName(String paramString) {
    this.serverName = paramString;
  }
}
