package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.UserSession;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSession", propOrder = {"key", "userName", "fullName", "loginTime", "lastActiveTime", "locale", "messageLocale", "extensionSession", "ipAddress", "userAgent", "callCount"})
public class UserSession extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String userName;
  
  @XmlElement(required = true)
  protected String fullName;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar loginTime;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastActiveTime;
  
  @XmlElement(required = true)
  protected String locale;
  
  @XmlElement(required = true)
  protected String messageLocale;
  
  protected Boolean extensionSession;
  
  protected String ipAddress;
  
  protected String userAgent;
  
  protected Long callCount;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String paramString) {
    this.fullName = paramString;
  }
  
  public XMLGregorianCalendar getLoginTime() {
    return this.loginTime;
  }
  
  public void setLoginTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.loginTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getLastActiveTime() {
    return this.lastActiveTime;
  }
  
  public void setLastActiveTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastActiveTime = paramXMLGregorianCalendar;
  }
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
  
  public String getMessageLocale() {
    return this.messageLocale;
  }
  
  public void setMessageLocale(String paramString) {
    this.messageLocale = paramString;
  }
  
  public Boolean isExtensionSession() {
    return this.extensionSession;
  }
  
  public void setExtensionSession(Boolean paramBoolean) {
    this.extensionSession = paramBoolean;
  }
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getUserAgent() {
    return this.userAgent;
  }
  
  public void setUserAgent(String paramString) {
    this.userAgent = paramString;
  }
  
  public Long getCallCount() {
    return this.callCount;
  }
  
  public void setCallCount(Long paramLong) {
    this.callCount = paramLong;
  }
}
