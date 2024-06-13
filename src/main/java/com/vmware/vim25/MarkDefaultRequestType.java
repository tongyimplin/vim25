package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MarkDefaultRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkDefaultRequestType", propOrder = {"_this", "clusterId"})
public class MarkDefaultRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
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
}
