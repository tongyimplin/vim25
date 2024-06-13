package com.vmware.vim25;

import com.vmware.vim25.SessionEvent;
import com.vmware.vim25.SessionTerminatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionTerminatedEvent", propOrder = {"sessionId", "terminatedUsername"})
public class SessionTerminatedEvent extends SessionEvent {
  @XmlElement(required = true)
  protected String sessionId;
  
  @XmlElement(required = true)
  protected String terminatedUsername;
  
  public String getSessionId() {
    return this.sessionId;
  }
  
  public void setSessionId(String paramString) {
    this.sessionId = paramString;
  }
  
  public String getTerminatedUsername() {
    return this.terminatedUsername;
  }
  
  public void setTerminatedUsername(String paramString) {
    this.terminatedUsername = paramString;
  }
}
