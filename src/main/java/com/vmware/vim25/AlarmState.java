package com.vmware.vim25;

import com.vmware.vim25.AlarmState;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmState", propOrder = {"key", "entity", "alarm", "overallStatus", "time", "acknowledged", "acknowledgedByUser", "acknowledgedTime", "eventKey", "disabled"})
public class AlarmState extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected ManagedObjectReference alarm;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus overallStatus;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar time;
  
  protected Boolean acknowledged;
  
  protected String acknowledgedByUser;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar acknowledgedTime;
  
  protected Integer eventKey;
  
  protected Boolean disabled;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
  
  public XMLGregorianCalendar getTime() {
    return this.time;
  }
  
  public void setTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.time = paramXMLGregorianCalendar;
  }
  
  public Boolean isAcknowledged() {
    return this.acknowledged;
  }
  
  public void setAcknowledged(Boolean paramBoolean) {
    this.acknowledged = paramBoolean;
  }
  
  public String getAcknowledgedByUser() {
    return this.acknowledgedByUser;
  }
  
  public void setAcknowledgedByUser(String paramString) {
    this.acknowledgedByUser = paramString;
  }
  
  public XMLGregorianCalendar getAcknowledgedTime() {
    return this.acknowledgedTime;
  }
  
  public void setAcknowledgedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.acknowledgedTime = paramXMLGregorianCalendar;
  }
  
  public Integer getEventKey() {
    return this.eventKey;
  }
  
  public void setEventKey(Integer paramInteger) {
    this.eventKey = paramInteger;
  }
  
  public Boolean isDisabled() {
    return this.disabled;
  }
  
  public void setDisabled(Boolean paramBoolean) {
    this.disabled = paramBoolean;
  }
}
