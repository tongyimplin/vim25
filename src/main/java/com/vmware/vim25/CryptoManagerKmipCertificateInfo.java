package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCertificateInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipCertificateInfo", propOrder = {"subject", "issuer", "serialNumber", "notBefore", "notAfter", "fingerprint", "checkTime", "secondsSinceValid", "secondsBeforeExpire"})
public class CryptoManagerKmipCertificateInfo extends DynamicData {
  @XmlElement(required = true)
  protected String subject;
  
  @XmlElement(required = true)
  protected String issuer;
  
  @XmlElement(required = true)
  protected String serialNumber;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar notBefore;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar notAfter;
  
  @XmlElement(required = true)
  protected String fingerprint;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar checkTime;
  
  protected Integer secondsSinceValid;
  
  protected Integer secondsBeforeExpire;
  
  public String getSubject() {
    return this.subject;
  }
  
  public void setSubject(String paramString) {
    this.subject = paramString;
  }
  
  public String getIssuer() {
    return this.issuer;
  }
  
  public void setIssuer(String paramString) {
    this.issuer = paramString;
  }
  
  public String getSerialNumber() {
    return this.serialNumber;
  }
  
  public void setSerialNumber(String paramString) {
    this.serialNumber = paramString;
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
  
  public String getFingerprint() {
    return this.fingerprint;
  }
  
  public void setFingerprint(String paramString) {
    this.fingerprint = paramString;
  }
  
  public XMLGregorianCalendar getCheckTime() {
    return this.checkTime;
  }
  
  public void setCheckTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.checkTime = paramXMLGregorianCalendar;
  }
  
  public Integer getSecondsSinceValid() {
    return this.secondsSinceValid;
  }
  
  public void setSecondsSinceValid(Integer paramInteger) {
    this.secondsSinceValid = paramInteger;
  }
  
  public Integer getSecondsBeforeExpire() {
    return this.secondsBeforeExpire;
  }
  
  public void setSecondsBeforeExpire(Integer paramInteger) {
    this.secondsBeforeExpire = paramInteger;
  }
}
