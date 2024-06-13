package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.EventEx;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LocalizedMethodFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventEx", propOrder = {"eventTypeId", "severity", "message", "arguments", "objectId", "objectType", "objectName", "fault"})
public class EventEx extends Event {
  @XmlElement(required = true)
  protected String eventTypeId;
  
  protected String severity;
  
  protected String message;
  
  protected List<KeyAnyValue> arguments;
  
  protected String objectId;
  
  protected String objectType;
  
  protected String objectName;
  
  protected LocalizedMethodFault fault;
  
  public String getEventTypeId() {
    return this.eventTypeId;
  }
  
  public void setEventTypeId(String paramString) {
    this.eventTypeId = paramString;
  }
  
  public String getSeverity() {
    return this.severity;
  }
  
  public void setSeverity(String paramString) {
    this.severity = paramString;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public List<KeyAnyValue> getArguments() {
    if (this.arguments == null)
      this.arguments = new ArrayList<>(); 
    return this.arguments;
  }
  
  public String getObjectId() {
    return this.objectId;
  }
  
  public void setObjectId(String paramString) {
    this.objectId = paramString;
  }
  
  public String getObjectType() {
    return this.objectType;
  }
  
  public void setObjectType(String paramString) {
    this.objectType = paramString;
  }
  
  public String getObjectName() {
    return this.objectName;
  }
  
  public void setObjectName(String paramString) {
    this.objectName = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
