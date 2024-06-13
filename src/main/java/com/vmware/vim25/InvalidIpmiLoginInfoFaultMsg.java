package com.vmware.vim25;

import com.vmware.vim25.InvalidIpmiLoginInfo;
import com.vmware.vim25.InvalidIpmiLoginInfoFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidIpmiLoginInfoFault", targetNamespace = "urn:vim25")
public class InvalidIpmiLoginInfoFaultMsg extends Exception {
  private InvalidIpmiLoginInfo faultInfo;
  
  public InvalidIpmiLoginInfoFaultMsg(String paramString, InvalidIpmiLoginInfo paramInvalidIpmiLoginInfo) {
    super(paramString);
    this.faultInfo = paramInvalidIpmiLoginInfo;
  }
  
  public InvalidIpmiLoginInfoFaultMsg(String paramString, InvalidIpmiLoginInfo paramInvalidIpmiLoginInfo, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidIpmiLoginInfo;
  }
  
  public InvalidIpmiLoginInfo getFaultInfo() {
    return this.faultInfo;
  }
}
