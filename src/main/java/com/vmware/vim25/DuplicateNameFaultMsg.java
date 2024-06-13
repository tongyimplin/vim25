package com.vmware.vim25;

import com.vmware.vim25.DuplicateName;
import com.vmware.vim25.DuplicateNameFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DuplicateNameFault", targetNamespace = "urn:vim25")
public class DuplicateNameFaultMsg extends Exception {
  private DuplicateName faultInfo;
  
  public DuplicateNameFaultMsg(String paramString, DuplicateName paramDuplicateName) {
    super(paramString);
    this.faultInfo = paramDuplicateName;
  }
  
  public DuplicateNameFaultMsg(String paramString, DuplicateName paramDuplicateName, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDuplicateName;
  }
  
  public DuplicateName getFaultInfo() {
    return this.faultInfo;
  }
}
