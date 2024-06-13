package com.vmware.vim25;

import com.vmware.vim25.CustomizationIdentitySettings;
import com.vmware.vim25.CustomizationLinuxPrep;
import com.vmware.vim25.CustomizationName;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationLinuxPrep", propOrder = {"hostName", "domain", "timeZone", "hwClockUTC", "scriptText"})
public class CustomizationLinuxPrep extends CustomizationIdentitySettings {
  @XmlElement(required = true)
  protected CustomizationName hostName;
  
  @XmlElement(required = true)
  protected String domain;
  
  protected String timeZone;
  
  protected Boolean hwClockUTC;
  
  protected String scriptText;
  
  public CustomizationName getHostName() {
    return this.hostName;
  }
  
  public void setHostName(CustomizationName paramCustomizationName) {
    this.hostName = paramCustomizationName;
  }
  
  public String getDomain() {
    return this.domain;
  }
  
  public void setDomain(String paramString) {
    this.domain = paramString;
  }
  
  public String getTimeZone() {
    return this.timeZone;
  }
  
  public void setTimeZone(String paramString) {
    this.timeZone = paramString;
  }
  
  public Boolean isHwClockUTC() {
    return this.hwClockUTC;
  }
  
  public void setHwClockUTC(Boolean paramBoolean) {
    this.hwClockUTC = paramBoolean;
  }
  
  public String getScriptText() {
    return this.scriptText;
  }
  
  public void setScriptText(String paramString) {
    this.scriptText = paramString;
  }
}
