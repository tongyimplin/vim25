package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.HostNtpConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDateTimeConfig", propOrder = {"timeZone", "ntpConfig"})
public class HostDateTimeConfig extends DynamicData {
  protected String timeZone;
  
  protected HostNtpConfig ntpConfig;
  
  public String getTimeZone() {
    return this.timeZone;
  }
  
  public void setTimeZone(String paramString) {
    this.timeZone = paramString;
  }
  
  public HostNtpConfig getNtpConfig() {
    return this.ntpConfig;
  }
  
  public void setNtpConfig(HostNtpConfig paramHostNtpConfig) {
    this.ntpConfig = paramHostNtpConfig;
  }
}
