package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerformanceManagerCounterLevelMapping;
import com.vmware.vim25.UpdateCounterLevelMappingRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCounterLevelMappingRequestType", propOrder = {"_this", "counterLevelMap"})
public class UpdateCounterLevelMappingRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<PerformanceManagerCounterLevelMapping> counterLevelMap;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<PerformanceManagerCounterLevelMapping> getCounterLevelMap() {
    if (this.counterLevelMap == null)
      this.counterLevelMap = new ArrayList<>(); 
    return this.counterLevelMap;
  }
}
