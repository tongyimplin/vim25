package com.vmware.vim25;

import com.vmware.vim25.SSLVerifyFault;
import com.vmware.vim25.SSLVerifyFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "SSLVerifyFaultFault", targetNamespace = "urn:vim25")
public class SSLVerifyFaultFaultMsg extends Exception {
  private SSLVerifyFault faultInfo;
  
  public SSLVerifyFaultFaultMsg(String paramString, SSLVerifyFault paramSSLVerifyFault) {
    super(paramString);
    this.faultInfo = paramSSLVerifyFault;
  }
  
  public SSLVerifyFaultFaultMsg(String paramString, SSLVerifyFault paramSSLVerifyFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramSSLVerifyFault;
  }
  
  public SSLVerifyFault getFaultInfo() {
    return this.faultInfo;
  }
}
