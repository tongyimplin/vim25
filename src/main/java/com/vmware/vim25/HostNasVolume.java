package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostNasVolume;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNasVolume", propOrder = {"remoteHost", "remotePath", "userName", "remoteHostNames", "securityType", "protocolEndpoint"})
public class HostNasVolume extends HostFileSystemVolume {
  @XmlElement(required = true)
  protected String remoteHost;
  
  @XmlElement(required = true)
  protected String remotePath;
  
  protected String userName;
  
  protected List<String> remoteHostNames;
  
  protected String securityType;
  
  protected Boolean protocolEndpoint;
  
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
  
  public List<String> getRemoteHostNames() {
    if (this.remoteHostNames == null)
      this.remoteHostNames = new ArrayList<>(); 
    return this.remoteHostNames;
  }
  
  public String getSecurityType() {
    return this.securityType;
  }
  
  public void setSecurityType(String paramString) {
    this.securityType = paramString;
  }
  
  public Boolean isProtocolEndpoint() {
    return this.protocolEndpoint;
  }
  
  public void setProtocolEndpoint(Boolean paramBoolean) {
    this.protocolEndpoint = paramBoolean;
  }
}
