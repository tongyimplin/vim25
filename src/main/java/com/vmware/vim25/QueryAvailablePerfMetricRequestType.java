package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryAvailablePerfMetricRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAvailablePerfMetricRequestType", propOrder = {"_this", "entity", "beginTime", "endTime", "intervalId"})
public class QueryAvailablePerfMetricRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar beginTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endTime;
  
  protected Integer intervalId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public XMLGregorianCalendar getBeginTime() {
    return this.beginTime;
  }
  
  public void setBeginTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.beginTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getEndTime() {
    return this.endTime;
  }
  
  public void setEndTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.endTime = paramXMLGregorianCalendar;
  }
  
  public Integer getIntervalId() {
    return this.intervalId;
  }
  
  public void setIntervalId(Integer paramInteger) {
    this.intervalId = paramInteger;
  }
}
