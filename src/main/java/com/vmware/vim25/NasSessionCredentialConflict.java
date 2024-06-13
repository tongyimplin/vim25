package com.vmware.vim25;

import com.vmware.vim25.NasConfigFault;
import com.vmware.vim25.NasSessionCredentialConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasSessionCredentialConflict", propOrder = {"remoteHost", "remotePath", "userName"})
public class NasSessionCredentialConflict extends NasConfigFault {
  @XmlElement(required = true)
  protected String remoteHost;
  
  @XmlElement(required = true)
  protected String remotePath;
  
  @XmlElement(required = true)
  protected String userName;
  
  public String getRemoteHost() {
    return this.remoteHost;
  }
  
  public void setRemoteHost(String paramString) {
    this.remoteHost = paramString;
  }
  
  public String getRemotePath() {
    return this.remotePath;
  }
  
  public void setRemotePath(String paramString) {
    this.remotePath = paramString;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
}
