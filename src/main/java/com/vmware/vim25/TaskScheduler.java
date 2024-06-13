package com.vmware.vim25;

import com.vmware.vim25.AfterStartupTaskScheduler;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OnceTaskScheduler;
import com.vmware.vim25.RecurrentTaskScheduler;
import com.vmware.vim25.TaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskScheduler", propOrder = {"activeTime", "expireTime"})
@XmlSeeAlso({OnceTaskScheduler.class, AfterStartupTaskScheduler.class, RecurrentTaskScheduler.class})
public class TaskScheduler extends DynamicData {
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar activeTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar expireTime;
  
  public XMLGregorianCalendar getActiveTime() {
    return this.activeTime;
  }
  
  public void setActiveTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.activeTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getExpireTime() {
    return this.expireTime;
  }
  
  public void setExpireTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.expireTime = paramXMLGregorianCalendar;
  }
}
