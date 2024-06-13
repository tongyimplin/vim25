package com.vmware.vim25;

import com.vmware.vim25.HostActiveDirectoryInfo;
import com.vmware.vim25.HostDirectoryStoreInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostActiveDirectoryInfo", propOrder = {"joinedDomain", "trustedDomain", "domainMembershipStatus", "smartCardAuthenticationEnabled"})
public class HostActiveDirectoryInfo extends HostDirectoryStoreInfo {
  protected String joinedDomain;
  
  protected List<String> trustedDomain;
  
  protected String domainMembershipStatus;
  
  protected Boolean smartCardAuthenticationEnabled;
  
  public String getJoinedDomain() {
    return this.joinedDomain;
  }
  
  public void setJoinedDomain(String paramString) {
    this.joinedDomain = paramString;
  }
  
  public List<String> getTrustedDomain() {
    if (this.trustedDomain == null)
      this.trustedDomain = new ArrayList<>(); 
    return this.trustedDomain;
  }
  
  public String getDomainMembershipStatus() {
    return this.domainMembershipStatus;
  }
  
  public void setDomainMembershipStatus(String paramString) {
    this.domainMembershipStatus = paramString;
  }
  
  public Boolean isSmartCardAuthenticationEnabled() {
    return this.smartCardAuthenticationEnabled;
  }
  
  public void setSmartCardAuthenticationEnabled(Boolean paramBoolean) {
    this.smartCardAuthenticationEnabled = paramBoolean;
  }
}
