package com.vmware.vim25;

import com.vmware.vim25.ConflictingConfiguration;
import com.vmware.vim25.ConflictingConfigurationFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ConflictingConfigurationFault", targetNamespace = "urn:vim25")
public class ConflictingConfigurationFaultMsg extends Exception {
  private ConflictingConfiguration faultInfo;
  
  public ConflictingConfigurationFaultMsg(String paramString, ConflictingConfiguration paramConflictingConfiguration) {
    super(paramString);
    this.faultInfo = paramConflictingConfiguration;
  }
  
  public ConflictingConfigurationFaultMsg(String paramString, ConflictingConfiguration paramConflictingConfiguration, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramConflictingConfiguration;
  }
  
  public ConflictingConfiguration getFaultInfo() {
    return this.faultInfo;
  }
}
