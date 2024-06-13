package com.vmware.vim25;

import com.vmware.vim25.ConflictingConfigurationConfig;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConflictingConfigurationConfig", propOrder = {"entity", "propertyPath"})
public class ConflictingConfigurationConfig extends DynamicData {
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected String propertyPath;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getPropertyPath() {
    return this.propertyPath;
  }
  
  public void setPropertyPath(String paramString) {
    this.propertyPath = paramString;
  }
}
