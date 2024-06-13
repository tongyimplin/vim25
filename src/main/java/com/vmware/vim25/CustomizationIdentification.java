package com.vmware.vim25;

import com.vmware.vim25.CustomizationIdentification;
import com.vmware.vim25.CustomizationPassword;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIdentification", propOrder = {"joinWorkgroup", "joinDomain", "domainAdmin", "domainAdminPassword"})
public class CustomizationIdentification extends DynamicData {
  protected String joinWorkgroup;
  
  protected String joinDomain;
  
  protected String domainAdmin;
  
  protected CustomizationPassword domainAdminPassword;
  
  public String getJoinWorkgroup() {
    return this.joinWorkgroup;
  }
  
  public void setJoinWorkgroup(String paramString) {
    this.joinWorkgroup = paramString;
  }
  
  public String getJoinDomain() {
    return this.joinDomain;
  }
  
  public void setJoinDomain(String paramString) {
    this.joinDomain = paramString;
  }
  
  public String getDomainAdmin() {
    return this.domainAdmin;
  }
  
  public void setDomainAdmin(String paramString) {
    this.domainAdmin = paramString;
  }
  
  public CustomizationPassword getDomainAdminPassword() {
    return this.domainAdminPassword;
  }
  
  public void setDomainAdminPassword(CustomizationPassword paramCustomizationPassword) {
    this.domainAdminPassword = paramCustomizationPassword;
  }
}
