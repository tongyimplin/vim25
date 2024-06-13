package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KmipServerInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveKmipServerCertRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveKmipServerCertRequestType", propOrder = {"_this", "keyProvider", "server"})
public class RetrieveKmipServerCertRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId keyProvider;
  
  @XmlElement(required = true)
  protected KmipServerInfo server;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KeyProviderId getKeyProvider() {
    return this.keyProvider;
  }
  
  public void setKeyProvider(KeyProviderId paramKeyProviderId) {
    this.keyProvider = paramKeyProviderId;
  }
  
  public KmipServerInfo getServer() {
    return this.server;
  }
  
  public void setServer(KmipServerInfo paramKmipServerInfo) {
    this.server = paramKmipServerInfo;
  }
}
