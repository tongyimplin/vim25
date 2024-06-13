package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfigIpV6Address;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpConfigIpV6Address", propOrder = {"ipAddress", "prefixLength", "origin", "dadState", "lifetime", "operation"})
public class HostIpConfigIpV6Address extends DynamicData {
  @XmlElement(required = true)
  protected String ipAddress;
  
  protected int prefixLength;
  
  protected String origin;
  
  protected String dadState;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lifetime;
  
  protected String operation;
  
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
  
  public String getDadState() {
    return this.dadState;
  }
  
  public void setDadState(String paramString) {
    this.dadState = paramString;
  }
  
  public XMLGregorianCalendar getLifetime() {
    return this.lifetime;
  }
  
  public void setLifetime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lifetime = paramXMLGregorianCalendar;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
