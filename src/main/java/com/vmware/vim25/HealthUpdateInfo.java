package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HealthUpdateInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthUpdateInfo", propOrder = {"id", "componentType", "description"})
public class HealthUpdateInfo extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String componentType;
  
  @XmlElement(required = true)
  protected String description;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getComponentType() {
    return this.componentType;
  }
  
  public void setComponentType(String paramString) {
    this.componentType = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
