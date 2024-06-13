package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionEventTypeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionEventTypeInfo", propOrder = {"eventID", "eventTypeSchema"})
public class ExtensionEventTypeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String eventID;
  
  protected String eventTypeSchema;
  
  public String getEventID() {
    return this.eventID;
  }
  
  public void setEventID(String paramString) {
    this.eventID = paramString;
  }
  
  public String getEventTypeSchema() {
    return this.eventTypeSchema;
  }
  
  public void setEventTypeSchema(String paramString) {
    this.eventTypeSchema = paramString;
  }
}
