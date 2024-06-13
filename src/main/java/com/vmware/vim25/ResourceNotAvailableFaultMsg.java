package com.vmware.vim25;

import com.vmware.vim25.ResourceNotAvailable;
import com.vmware.vim25.ResourceNotAvailableFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ResourceNotAvailableFault", targetNamespace = "urn:vim25")
public class ResourceNotAvailableFaultMsg extends Exception {
  private ResourceNotAvailable faultInfo;
  
  public ResourceNotAvailableFaultMsg(String paramString, ResourceNotAvailable paramResourceNotAvailable) {
    super(paramString);
    this.faultInfo = paramResourceNotAvailable;
  }
  
  public ResourceNotAvailableFaultMsg(String paramString, ResourceNotAvailable paramResourceNotAvailable, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramResourceNotAvailable;
  }
  
  public ResourceNotAvailable getFaultInfo() {
    return this.faultInfo;
  }
}
