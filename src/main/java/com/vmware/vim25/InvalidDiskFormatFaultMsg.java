package com.vmware.vim25;

import com.vmware.vim25.InvalidDiskFormat;
import com.vmware.vim25.InvalidDiskFormatFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidDiskFormatFault", targetNamespace = "urn:vim25")
public class InvalidDiskFormatFaultMsg extends Exception {
  private InvalidDiskFormat faultInfo;
  
  public InvalidDiskFormatFaultMsg(String paramString, InvalidDiskFormat paramInvalidDiskFormat) {
    super(paramString);
    this.faultInfo = paramInvalidDiskFormat;
  }
  
  public InvalidDiskFormatFaultMsg(String paramString, InvalidDiskFormat paramInvalidDiskFormat, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidDiskFormat;
  }
  
  public InvalidDiskFormat getFaultInfo() {
    return this.faultInfo;
  }
}
