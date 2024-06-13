package com.vmware.vim25;

import com.vmware.vim25.InvalidIpmiMacAddress;
import com.vmware.vim25.InvalidIpmiMacAddressFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidIpmiMacAddressFault", targetNamespace = "urn:vim25")
public class InvalidIpmiMacAddressFaultMsg extends Exception {
  private InvalidIpmiMacAddress faultInfo;
  
  public InvalidIpmiMacAddressFaultMsg(String paramString, InvalidIpmiMacAddress paramInvalidIpmiMacAddress) {
    super(paramString);
    this.faultInfo = paramInvalidIpmiMacAddress;
  }
  
  public InvalidIpmiMacAddressFaultMsg(String paramString, InvalidIpmiMacAddress paramInvalidIpmiMacAddress, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidIpmiMacAddress;
  }
  
  public InvalidIpmiMacAddress getFaultInfo() {
    return this.faultInfo;
  }
}
