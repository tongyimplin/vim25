package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.EventArgDesc;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventArgDesc", propOrder = {"name", "type", "description"})
public class EventArgDesc extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String type;
  
  protected ElementDescription description;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public ElementDescription getDescription() {
    return this.description;
  }
  
  public void setDescription(ElementDescription paramElementDescription) {
    this.description = paramElementDescription;
  }
}
