package com.vmware.vim25;

import com.vmware.vim25.NoDiskSpace;
import com.vmware.vim25.NoDiskSpaceFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NoDiskSpaceFault", targetNamespace = "urn:vim25")
public class NoDiskSpaceFaultMsg extends Exception {
  private NoDiskSpace faultInfo;
  
  public NoDiskSpaceFaultMsg(String paramString, NoDiskSpace paramNoDiskSpace) {
    super(paramString);
    this.faultInfo = paramNoDiskSpace;
  }
  
  public NoDiskSpaceFaultMsg(String paramString, NoDiskSpace paramNoDiskSpace, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNoDiskSpace;
  }
  
  public NoDiskSpace getFaultInfo() {
    return this.faultInfo;
  }
}
