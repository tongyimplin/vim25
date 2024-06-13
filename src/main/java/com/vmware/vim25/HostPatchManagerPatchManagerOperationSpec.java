package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPatchManagerPatchManagerOperationSpec", propOrder = {"proxy", "port", "userName", "password", "cmdOption"})
public class HostPatchManagerPatchManagerOperationSpec extends DynamicData {
  protected String proxy;
  
  protected Integer port;
  
  protected String userName;
  
  protected String password;
  
  protected String cmdOption;
  
  public String getProxy() {
    return this.proxy;
  }
  
  public void setProxy(String paramString) {
    this.proxy = paramString;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
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
  
  public String getCmdOption() {
    return this.cmdOption;
  }
  
  public void setCmdOption(String paramString) {
    this.cmdOption = paramString;
  }
}
