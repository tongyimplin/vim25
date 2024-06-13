package com.vmware.vim25;

import com.vmware.vim25.SessionEvent;
import com.vmware.vim25.UserLoginSessionEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLoginSessionEvent", propOrder = {"ipAddress", "userAgent", "locale", "sessionId"})
public class UserLoginSessionEvent extends SessionEvent {
  @XmlElement(required = true)
  protected String ipAddress;
  
  protected String userAgent;
  
  @XmlElement(required = true)
  protected String locale;
  
  @XmlElement(required = true)
  protected String sessionId;
  
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
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
  
  public String getSessionId() {
    return this.sessionId;
  }
  
  public void setSessionId(String paramString) {
    this.sessionId = paramString;
  }
}
