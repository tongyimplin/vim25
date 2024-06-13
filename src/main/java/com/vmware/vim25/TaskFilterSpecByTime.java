package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.TaskFilterSpecByTime;
import com.vmware.vim25.TaskFilterSpecTimeOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpecByTime", propOrder = {"timeType", "beginTime", "endTime"})
public class TaskFilterSpecByTime extends DynamicData {
  @XmlElement(required = true)
  protected TaskFilterSpecTimeOption timeType;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar beginTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endTime;
  
  public TaskFilterSpecTimeOption getTimeType() {
    return this.timeType;
  }
  
  public void setTimeType(TaskFilterSpecTimeOption paramTaskFilterSpecTimeOption) {
    this.timeType = paramTaskFilterSpecTimeOption;
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
}
