package com.vmware.vim25;

import com.vmware.vim25.CancelStorageDrsRecommendationRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelStorageDrsRecommendationRequestType", propOrder = {"_this", "key"})
public class CancelStorageDrsRecommendationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> key;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getKey() {
    if (this.key == null)
      this.key = new ArrayList<>(); 
    return this.key;
  }
}
