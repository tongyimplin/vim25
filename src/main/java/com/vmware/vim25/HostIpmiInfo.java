package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpmiInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpmiInfo", propOrder = {"bmcIpAddress", "bmcMacAddress", "login", "password"})
public class HostIpmiInfo extends DynamicData {
  protected String bmcIpAddress;
  
  protected String bmcMacAddress;
  
  protected String login;
  
  protected String password;
  
  public String getBmcIpAddress() {
    return this.bmcIpAddress;
  }
  
  public void setBmcIpAddress(String paramString) {
    this.bmcIpAddress = paramString;
  }
  
  public String getBmcMacAddress() {
    return this.bmcMacAddress;
  }
  
  public void setBmcMacAddress(String paramString) {
    this.bmcMacAddress = paramString;
  }
  
  public String getLogin() {
    return this.login;
  }
  
  public void setLogin(String paramString) {
    this.login = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
}
