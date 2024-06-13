package com.vmware.vim25;

import com.vmware.vim25.PatchInstallFailed;
import com.vmware.vim25.PatchInstallFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "PatchInstallFailedFault", targetNamespace = "urn:vim25")
public class PatchInstallFailedFaultMsg extends Exception {
  private PatchInstallFailed faultInfo;
  
  public PatchInstallFailedFaultMsg(String paramString, PatchInstallFailed paramPatchInstallFailed) {
    super(paramString);
    this.faultInfo = paramPatchInstallFailed;
  }
  
  public PatchInstallFailedFaultMsg(String paramString, PatchInstallFailed paramPatchInstallFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramPatchInstallFailed;
  }
  
  public PatchInstallFailed getFaultInfo() {
    return this.faultInfo;
  }
}
