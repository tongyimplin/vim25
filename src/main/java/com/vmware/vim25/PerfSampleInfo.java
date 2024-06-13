package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfSampleInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfSampleInfo", propOrder = {"timestamp", "interval"})
public class PerfSampleInfo extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  protected int interval;
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
  
  public int getInterval() {
    return this.interval;
  }
  
  public void setInterval(int paramInt) {
    this.interval = paramInt;
  }
}
