package com.vmware.vim25;

import com.vmware.vim25.HostPowerOpFailed;
import com.vmware.vim25.HostPowerOpFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostPowerOpFailedFault", targetNamespace = "urn:vim25")
public class HostPowerOpFailedFaultMsg extends Exception {
  private HostPowerOpFailed faultInfo;
  
  public HostPowerOpFailedFaultMsg(String paramString, HostPowerOpFailed paramHostPowerOpFailed) {
    super(paramString);
    this.faultInfo = paramHostPowerOpFailed;
  }
  
  public HostPowerOpFailedFaultMsg(String paramString, HostPowerOpFailed paramHostPowerOpFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostPowerOpFailed;
  }
  
  public HostPowerOpFailed getFaultInfo() {
    return this.faultInfo;
  }
}
