package com.vmware.vim25;

import com.vmware.vim25.NoClientCertificate;
import com.vmware.vim25.NoClientCertificateFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NoClientCertificateFault", targetNamespace = "urn:vim25")
public class NoClientCertificateFaultMsg extends Exception {
  private NoClientCertificate faultInfo;
  
  public NoClientCertificateFaultMsg(String paramString, NoClientCertificate paramNoClientCertificate) {
    super(paramString);
    this.faultInfo = paramNoClientCertificate;
  }
  
  public NoClientCertificateFaultMsg(String paramString, NoClientCertificate paramNoClientCertificate, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNoClientCertificate;
  }
  
  public NoClientCertificate getFaultInfo() {
    return this.faultInfo;
  }
}
