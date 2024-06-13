package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaAuthenticationProperties", propOrder = {"chapAuthEnabled", "chapName", "chapSecret", "chapAuthenticationType", "chapInherited", "mutualChapName", "mutualChapSecret", "mutualChapAuthenticationType", "mutualChapInherited"})
public class HostInternetScsiHbaAuthenticationProperties extends DynamicData {
  protected boolean chapAuthEnabled;
  
  protected String chapName;
  
  protected String chapSecret;
  
  protected String chapAuthenticationType;
  
  protected Boolean chapInherited;
  
  protected String mutualChapName;
  
  protected String mutualChapSecret;
  
  protected String mutualChapAuthenticationType;
  
  protected Boolean mutualChapInherited;
  
  public boolean isChapAuthEnabled() {
    return this.chapAuthEnabled;
  }
  
  public void setChapAuthEnabled(boolean paramBoolean) {
    this.chapAuthEnabled = paramBoolean;
  }
  
  public String getChapName() {
    return this.chapName;
  }
  
  public void setChapName(String paramString) {
    this.chapName = paramString;
  }
  
  public String getChapSecret() {
    return this.chapSecret;
  }
  
  public void setChapSecret(String paramString) {
    this.chapSecret = paramString;
  }
  
  public String getChapAuthenticationType() {
    return this.chapAuthenticationType;
  }
  
  public void setChapAuthenticationType(String paramString) {
    this.chapAuthenticationType = paramString;
  }
  
  public Boolean isChapInherited() {
    return this.chapInherited;
  }
  
  public void setChapInherited(Boolean paramBoolean) {
    this.chapInherited = paramBoolean;
  }
  
  public String getMutualChapName() {
    return this.mutualChapName;
  }
  
  public void setMutualChapName(String paramString) {
    this.mutualChapName = paramString;
  }
  
  public String getMutualChapSecret() {
    return this.mutualChapSecret;
  }
  
  public void setMutualChapSecret(String paramString) {
    this.mutualChapSecret = paramString;
  }
  
  public String getMutualChapAuthenticationType() {
    return this.mutualChapAuthenticationType;
  }
  
  public void setMutualChapAuthenticationType(String paramString) {
    this.mutualChapAuthenticationType = paramString;
  }
  
  public Boolean isMutualChapInherited() {
    return this.mutualChapInherited;
  }
  
  public void setMutualChapInherited(Boolean paramBoolean) {
    this.mutualChapInherited = paramBoolean;
  }
}
