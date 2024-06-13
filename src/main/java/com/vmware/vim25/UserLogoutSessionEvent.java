package com.vmware.vim25;

import com.vmware.vim25.SessionEvent;
import com.vmware.vim25.UserLogoutSessionEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLogoutSessionEvent", propOrder = {"ipAddress", "userAgent", "callCount", "sessionId", "loginTime"})
public class UserLogoutSessionEvent extends SessionEvent {
  protected String ipAddress;
  
  protected String userAgent;
  
  protected Long callCount;
  
  protected String sessionId;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar loginTime;
  
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
  
  public String getSessionId() {
    return this.sessionId;
  }
  
  public void setSessionId(String paramString) {
    this.sessionId = paramString;
  }
  
  public XMLGregorianCalendar getLoginTime() {
    return this.loginTime;
  }
  
  public void setLoginTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.loginTime = paramXMLGregorianCalendar;
  }
}
