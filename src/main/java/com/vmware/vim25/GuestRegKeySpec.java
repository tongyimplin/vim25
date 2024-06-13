package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.GuestRegKeySpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegKeySpec", propOrder = {"keyName", "classType", "lastWritten"})
public class GuestRegKeySpec extends DynamicData {
  @XmlElement(required = true)
  protected GuestRegKeyNameSpec keyName;
  
  @XmlElement(required = true)
  protected String classType;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastWritten;
  
  public GuestRegKeyNameSpec getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(GuestRegKeyNameSpec paramGuestRegKeyNameSpec) {
    this.keyName = paramGuestRegKeyNameSpec;
  }
  
  public String getClassType() {
    return this.classType;
  }
  
  public void setClassType(String paramString) {
    this.classType = paramString;
  }
  
  public XMLGregorianCalendar getLastWritten() {
    return this.lastWritten;
  }
  
  public void setLastWritten(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastWritten = paramXMLGregorianCalendar;
  }
}
