package com.vmware.vim25;

import com.vmware.vim25.ResourceInUse;
import com.vmware.vim25.ResourceInUseFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ResourceInUseFault", targetNamespace = "urn:vim25")
public class ResourceInUseFaultMsg extends Exception {
  private ResourceInUse faultInfo;
  
  public ResourceInUseFaultMsg(String paramString, ResourceInUse paramResourceInUse) {
    super(paramString);
    this.faultInfo = paramResourceInUse;
  }
  
  public ResourceInUseFaultMsg(String paramString, ResourceInUse paramResourceInUse, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramResourceInUse;
  }
  
  public ResourceInUse getFaultInfo() {
    return this.faultInfo;
  }
}
