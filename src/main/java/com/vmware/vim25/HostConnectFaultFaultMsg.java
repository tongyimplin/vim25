package com.vmware.vim25;

import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.HostConnectFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostConnectFaultFault", targetNamespace = "urn:vim25")
public class HostConnectFaultFaultMsg extends Exception {
  private HostConnectFault faultInfo;
  
  public HostConnectFaultFaultMsg(String paramString, HostConnectFault paramHostConnectFault) {
    super(paramString);
    this.faultInfo = paramHostConnectFault;
  }
  
  public HostConnectFaultFaultMsg(String paramString, HostConnectFault paramHostConnectFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostConnectFault;
  }
  
  public HostConnectFault getFaultInfo() {
    return this.faultInfo;
  }
}
