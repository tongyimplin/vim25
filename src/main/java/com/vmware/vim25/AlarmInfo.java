package com.vmware.vim25;

import com.vmware.vim25.AlarmInfo;
import com.vmware.vim25.AlarmSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmInfo", propOrder = {"key", "alarm", "entity", "lastModifiedTime", "lastModifiedUser", "creationEventId"})
public class AlarmInfo extends AlarmSpec {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected ManagedObjectReference alarm;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastModifiedTime;
  
  @XmlElement(required = true)
  protected String lastModifiedUser;
  
  protected int creationEventId;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public XMLGregorianCalendar getLastModifiedTime() {
    return this.lastModifiedTime;
  }
  
  public void setLastModifiedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastModifiedTime = paramXMLGregorianCalendar;
  }
  
  public String getLastModifiedUser() {
    return this.lastModifiedUser;
  }
  
  public void setLastModifiedUser(String paramString) {
    this.lastModifiedUser = paramString;
  }
  
  public int getCreationEventId() {
    return this.creationEventId;
  }
  
  public void setCreationEventId(int paramInt) {
    this.creationEventId = paramInt;
  }
}
