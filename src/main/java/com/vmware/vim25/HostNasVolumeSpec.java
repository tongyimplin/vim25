package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNasVolumeSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNasVolumeSpec", propOrder = {"remoteHost", "remotePath", "localPath", "accessMode", "type", "userName", "password", "remoteHostNames", "securityType"})
public class HostNasVolumeSpec extends DynamicData {
  @XmlElement(required = true)
  protected String remoteHost;
  
  @XmlElement(required = true)
  protected String remotePath;
  
  @XmlElement(required = true)
  protected String localPath;
  
  @XmlElement(required = true)
  protected String accessMode;
  
  protected String type;
  
  protected String userName;
  
  protected String password;
  
  protected List<String> remoteHostNames;
  
  protected String securityType;
  
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
  
  public String getLocalPath() {
    return this.localPath;
  }
  
  public void setLocalPath(String paramString) {
    this.localPath = paramString;
  }
  
  public String getAccessMode() {
    return this.accessMode;
  }
  
  public void setAccessMode(String paramString) {
    this.accessMode = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
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
}
