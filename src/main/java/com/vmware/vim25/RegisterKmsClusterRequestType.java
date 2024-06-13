package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RegisterKmsClusterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterKmsClusterRequestType", propOrder = {"_this", "clusterId", "managementType"})
public class RegisterKmsClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  protected String managementType;
  
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
  
  public String getManagementType() {
    return this.managementType;
  }
  
  public void setManagementType(String paramString) {
    this.managementType = paramString;
  }
}
