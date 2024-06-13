package com.vmware.vim25;

import com.vmware.vim25.FilterInUse;
import com.vmware.vim25.FilterInUseFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "FilterInUseFault", targetNamespace = "urn:vim25")
public class FilterInUseFaultMsg extends Exception {
  private FilterInUse faultInfo;
  
  public FilterInUseFaultMsg(String paramString, FilterInUse paramFilterInUse) {
    super(paramString);
    this.faultInfo = paramFilterInUse;
  }
  
  public FilterInUseFaultMsg(String paramString, FilterInUse paramFilterInUse, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramFilterInUse;
  }
  
  public FilterInUse getFaultInfo() {
    return this.faultInfo;
  }
}
