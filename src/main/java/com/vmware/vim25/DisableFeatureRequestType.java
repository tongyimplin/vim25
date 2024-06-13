package com.vmware.vim25;

import com.vmware.vim25.DisableFeatureRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisableFeatureRequestType", propOrder = {"_this", "host", "featureKey"})
public class DisableFeatureRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String featureKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getFeatureKey() {
    return this.featureKey;
  }
  
  public void setFeatureKey(String paramString) {
    this.featureKey = paramString;
  }
}
