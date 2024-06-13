package com.vmware.vim25;

import com.vmware.vim25.AgentInstallFailed;
import com.vmware.vim25.HostConnectFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentInstallFailed", propOrder = {"reason", "statusCode", "installerOutput"})
public class AgentInstallFailed extends HostConnectFault {
  protected String reason;
  
  protected Integer statusCode;
  
  protected String installerOutput;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public Integer getStatusCode() {
    return this.statusCode;
  }
  
  public void setStatusCode(Integer paramInteger) {
    this.statusCode = paramInteger;
  }
  
  public String getInstallerOutput() {
    return this.installerOutput;
  }
  
  public void setInstallerOutput(String paramString) {
    this.installerOutput = paramString;
  }
}
