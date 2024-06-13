package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultInvalidVnic;
import com.vmware.vim25.IscsiFaultInvalidVnicFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultInvalidVnicFault", targetNamespace = "urn:vim25")
public class IscsiFaultInvalidVnicFaultMsg extends Exception {
  private IscsiFaultInvalidVnic faultInfo;
  
  public IscsiFaultInvalidVnicFaultMsg(String paramString, IscsiFaultInvalidVnic paramIscsiFaultInvalidVnic) {
    super(paramString);
    this.faultInfo = paramIscsiFaultInvalidVnic;
  }
  
  public IscsiFaultInvalidVnicFaultMsg(String paramString, IscsiFaultInvalidVnic paramIscsiFaultInvalidVnic, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultInvalidVnic;
  }
  
  public IscsiFaultInvalidVnic getFaultInfo() {
    return this.faultInfo;
  }
}
