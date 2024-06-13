package com.vmware.vim25;

import com.vmware.vim25.GenerateSelfSignedClientCertRequestType;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateSelfSignedClientCertRequestType", propOrder = {"_this", "cluster"})
public class GenerateSelfSignedClientCertRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId cluster;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KeyProviderId getCluster() {
    return this.cluster;
  }
  
  public void setCluster(KeyProviderId paramKeyProviderId) {
    this.cluster = paramKeyProviderId;
  }
}
