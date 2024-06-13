package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpConfigInfoIpAddress;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpConfigInfoIpAddress", propOrder = {"ipAddress", "prefixLength", "origin", "state", "lifetime"})
public class NetIpConfigInfoIpAddress extends DynamicData {
  @XmlElement(required = true)
  protected String ipAddress;
  
  protected int prefixLength;
  
  protected String origin;
  
  protected String state;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lifetime;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public int getPrefixLength() {
    return this.prefixLength;
  }
  
  public void setPrefixLength(int paramInt) {
    this.prefixLength = paramInt;
  }
  
  public String getOrigin() {
    return this.origin;
  }
  
  public void setOrigin(String paramString) {
    this.origin = paramString;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public XMLGregorianCalendar getLifetime() {
    return this.lifetime;
  }
  
  public void setLifetime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lifetime = paramXMLGregorianCalendar;
  }
}
