package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpStackInfoDefaultRouter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpStackInfoDefaultRouter", propOrder = {"ipAddress", "device", "lifetime", "preference"})
public class NetIpStackInfoDefaultRouter extends DynamicData {
  @XmlElement(required = true)
  protected String ipAddress;
  
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lifetime;
  
  @XmlElement(required = true)
  protected String preference;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public XMLGregorianCalendar getLifetime() {
    return this.lifetime;
  }
  
  public void setLifetime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lifetime = paramXMLGregorianCalendar;
  }
  
  public String getPreference() {
    return this.preference;
  }
  
  public void setPreference(String paramString) {
    this.preference = paramString;
  }
}
