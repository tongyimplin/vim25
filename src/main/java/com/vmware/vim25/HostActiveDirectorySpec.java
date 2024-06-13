package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostActiveDirectorySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostActiveDirectorySpec", propOrder = {"domainName", "userName", "password", "camServer", "thumbprint", "smartCardAuthenticationEnabled", "smartCardTrustAnchors"})
public class HostActiveDirectorySpec extends DynamicData {
  protected String domainName;
  
  protected String userName;
  
  protected String password;
  
  protected String camServer;
  
  protected String thumbprint;
  
  protected Boolean smartCardAuthenticationEnabled;
  
  protected List<String> smartCardTrustAnchors;
  
  public String getDomainName() {
    return this.domainName;
  }
  
  public void setDomainName(String paramString) {
    this.domainName = paramString;
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
  
  public String getCamServer() {
    return this.camServer;
  }
  
  public void setCamServer(String paramString) {
    this.camServer = paramString;
  }
  
  public String getThumbprint() {
    return this.thumbprint;
  }
  
  public void setThumbprint(String paramString) {
    this.thumbprint = paramString;
  }
  
  public Boolean isSmartCardAuthenticationEnabled() {
    return this.smartCardAuthenticationEnabled;
  }
  
  public void setSmartCardAuthenticationEnabled(Boolean paramBoolean) {
    this.smartCardAuthenticationEnabled = paramBoolean;
  }
  
  public List<String> getSmartCardTrustAnchors() {
    if (this.smartCardTrustAnchors == null)
      this.smartCardTrustAnchors = new ArrayList<>(); 
    return this.smartCardTrustAnchors;
  }
}
