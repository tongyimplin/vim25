package com.vmware.vim25;

import com.vmware.vim25.CustomizationFault;
import com.vmware.vim25.CustomizationFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "CustomizationFaultFault", targetNamespace = "urn:vim25")
public class CustomizationFaultFaultMsg extends Exception {
  private CustomizationFault faultInfo;
  
  public CustomizationFaultFaultMsg(String paramString, CustomizationFault paramCustomizationFault) {
    super(paramString);
    this.faultInfo = paramCustomizationFault;
  }
  
  public CustomizationFaultFaultMsg(String paramString, CustomizationFault paramCustomizationFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramCustomizationFault;
  }
  
  public CustomizationFault getFaultInfo() {
    return this.faultInfo;
  }
}
