package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventFilterSpecByTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterSpecByTime", propOrder = {"beginTime", "endTime"})
public class EventFilterSpecByTime extends DynamicData {
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar beginTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endTime;
  
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
