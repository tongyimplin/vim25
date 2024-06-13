package com.vmware.vim25;

import com.vmware.vim25.PatchBinariesNotFound;
import com.vmware.vim25.PatchBinariesNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "PatchBinariesNotFoundFault", targetNamespace = "urn:vim25")
public class PatchBinariesNotFoundFaultMsg extends Exception {
  private PatchBinariesNotFound faultInfo;
  
  public PatchBinariesNotFoundFaultMsg(String paramString, PatchBinariesNotFound paramPatchBinariesNotFound) {
    super(paramString);
    this.faultInfo = paramPatchBinariesNotFound;
  }
  
  public PatchBinariesNotFoundFaultMsg(String paramString, PatchBinariesNotFound paramPatchBinariesNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramPatchBinariesNotFound;
  }
  
  public PatchBinariesNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
