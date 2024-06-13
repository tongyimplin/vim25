package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostCertificateManagerCertificateInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCertificateManagerCertificateInfo", propOrder = {"issuer", "notBefore", "notAfter", "subject", "status"})
public class HostCertificateManagerCertificateInfo extends DynamicData {
  protected String issuer;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar notBefore;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar notAfter;
  
  protected String subject;
  
  @XmlElement(required = true)
  protected String status;
  
  public String getIssuer() {
    return this.issuer;
  }
  
  public void setIssuer(String paramString) {
    this.issuer = paramString;
  }
  
  public XMLGregorianCalendar getNotBefore() {
    return this.notBefore;
  }
  
  public void setNotBefore(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.notBefore = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getNotAfter() {
    return this.notAfter;
  }
  
  public void setNotAfter(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.notAfter = paramXMLGregorianCalendar;
  }
  
  public String getSubject() {
    return this.subject;
  }
  
  public void setSubject(String paramString) {
    this.subject = paramString;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
}
