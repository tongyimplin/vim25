package com.vmware.vim25;

import com.vmware.vim25.CurrentTimeResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CurrentTimeResponse")
public class CurrentTimeResponse {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar returnval;
  
  public XMLGregorianCalendar getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.returnval = paramXMLGregorianCalendar;
  }
}
