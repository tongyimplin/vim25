package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemComplianceCheckState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemComplianceCheckState", propOrder = {"state", "checkTime"})
public class HostSystemComplianceCheckState extends DynamicData {
  @XmlElement(required = true)
  protected String state;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar checkTime;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public XMLGregorianCalendar getCheckTime() {
    return this.checkTime;
  }
  
  public void setCheckTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.checkTime = paramXMLGregorianCalendar;
  }
}
