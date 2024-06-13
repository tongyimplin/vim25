package com.vmware.vim25;

import com.vmware.vim25.OnceTaskScheduler;
import com.vmware.vim25.TaskScheduler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnceTaskScheduler", propOrder = {"runAt"})
public class OnceTaskScheduler extends TaskScheduler {
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar runAt;
  
  public XMLGregorianCalendar getRunAt() {
    return this.runAt;
  }
  
  public void setRunAt(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.runAt = paramXMLGregorianCalendar;
  }
}
