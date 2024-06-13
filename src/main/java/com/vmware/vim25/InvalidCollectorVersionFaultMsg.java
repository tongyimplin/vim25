package com.vmware.vim25;

import com.vmware.vim25.InvalidCollectorVersion;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidCollectorVersionFault", targetNamespace = "urn:vim25")
public class InvalidCollectorVersionFaultMsg extends Exception {
  private InvalidCollectorVersion faultInfo;
  
  public InvalidCollectorVersionFaultMsg(String paramString, InvalidCollectorVersion paramInvalidCollectorVersion) {
    super(paramString);
    this.faultInfo = paramInvalidCollectorVersion;
  }
  
  public InvalidCollectorVersionFaultMsg(String paramString, InvalidCollectorVersion paramInvalidCollectorVersion, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidCollectorVersion;
  }
  
  public InvalidCollectorVersion getFaultInfo() {
    return this.faultInfo;
  }
}
