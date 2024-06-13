package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RefreshStorageDrsRecommendationsForPodRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshStorageDrsRecommendationsForPodRequestType", propOrder = {"_this", "pod"})
public class RefreshStorageDrsRecommendationsForPodRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference pod;
  
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
}
