package com.vmware.vim25;

import com.vmware.vim25.ApplyStorageDrsRecommendationToPodRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyStorageDrsRecommendationToPodRequestType", propOrder = {"_this", "pod", "key"})
public class ApplyStorageDrsRecommendationToPodRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference pod;
  
  @XmlElement(required = true)
  protected String key;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPod() {
    return this.pod;
  }
  
  public void setPod(ManagedObjectReference paramManagedObjectReference) {
    this.pod = paramManagedObjectReference;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
