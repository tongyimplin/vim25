package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SessionManagerLocalTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagerLocalTicket", propOrder = {"userName", "passwordFilePath"})
public class SessionManagerLocalTicket extends DynamicData {
  @XmlElement(required = true)
  protected String userName;
  
  @XmlElement(required = true)
  protected String passwordFilePath;
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public String getPasswordFilePath() {
    return this.passwordFilePath;
  }
  
  public void setPasswordFilePath(String paramString) {
    this.passwordFilePath = paramString;
  }
}
