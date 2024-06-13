package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDateTimeInfo;
import com.vmware.vim25.HostDateTimeSystemTimeZone;
import com.vmware.vim25.HostNtpConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDateTimeInfo", propOrder = {"timeZone", "systemClockProtocol", "ntpConfig"})
public class HostDateTimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostDateTimeSystemTimeZone timeZone;
  
  protected String systemClockProtocol;
  
  protected HostNtpConfig ntpConfig;
  
  public HostDateTimeSystemTimeZone getTimeZone() {
    return this.timeZone;
  }
  
  public void setTimeZone(HostDateTimeSystemTimeZone paramHostDateTimeSystemTimeZone) {
    this.timeZone = paramHostDateTimeSystemTimeZone;
  }
  
  public String getSystemClockProtocol() {
    return this.systemClockProtocol;
  }
  
  public void setSystemClockProtocol(String paramString) {
    this.systemClockProtocol = paramString;
  }
  
  public HostNtpConfig getNtpConfig() {
    return this.ntpConfig;
  }
  
  public void setNtpConfig(HostNtpConfig paramHostNtpConfig) {
    this.ntpConfig = paramHostNtpConfig;
  }
}
