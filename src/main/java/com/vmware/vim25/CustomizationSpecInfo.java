package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpecInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpecInfo", propOrder = {"name", "description", "type", "changeVersion", "lastUpdateTime"})
public class CustomizationSpecInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String description;
  
  @XmlElement(required = true)
  protected String type;
  
  protected String changeVersion;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastUpdateTime;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getChangeVersion() {
    return this.changeVersion;
  }
  
  public void setChangeVersion(String paramString) {
    this.changeVersion = paramString;
  }
  
  public XMLGregorianCalendar getLastUpdateTime() {
    return this.lastUpdateTime;
  }
  
  public void setLastUpdateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastUpdateTime = paramXMLGregorianCalendar;
  }
}
