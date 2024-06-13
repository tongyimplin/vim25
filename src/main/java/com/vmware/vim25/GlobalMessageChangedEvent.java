package com.vmware.vim25;

import com.vmware.vim25.GlobalMessageChangedEvent;
import com.vmware.vim25.SessionEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalMessageChangedEvent", propOrder = {"message", "prevMessage"})
public class GlobalMessageChangedEvent extends SessionEvent {
  @XmlElement(required = true)
  protected String message;
  
  protected String prevMessage;
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public String getPrevMessage() {
    return this.prevMessage;
  }
  
  public void setPrevMessage(String paramString) {
    this.prevMessage = paramString;
  }
}
