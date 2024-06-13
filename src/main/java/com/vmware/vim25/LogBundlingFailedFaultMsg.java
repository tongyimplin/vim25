package com.vmware.vim25;

import com.vmware.vim25.LogBundlingFailed;
import com.vmware.vim25.LogBundlingFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "LogBundlingFailedFault", targetNamespace = "urn:vim25")
public class LogBundlingFailedFaultMsg extends Exception {
  private LogBundlingFailed faultInfo;
  
  public LogBundlingFailedFaultMsg(String paramString, LogBundlingFailed paramLogBundlingFailed) {
    super(paramString);
    this.faultInfo = paramLogBundlingFailed;
  }
  
  public LogBundlingFailedFaultMsg(String paramString, LogBundlingFailed paramLogBundlingFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramLogBundlingFailed;
  }
  
  public LogBundlingFailed getFaultInfo() {
    return this.faultInfo;
  }
}
