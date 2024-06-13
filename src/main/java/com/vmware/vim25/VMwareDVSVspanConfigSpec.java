package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSVspanConfigSpec;
import com.vmware.vim25.VMwareVspanSession;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSVspanConfigSpec", propOrder = {"vspanSession", "operation"})
public class VMwareDVSVspanConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected VMwareVspanSession vspanSession;
  
  @XmlElement(required = true)
  protected String operation;
  
  public VMwareVspanSession getVspanSession() {
    return this.vspanSession;
  }
  
  public void setVspanSession(VMwareVspanSession paramVMwareVspanSession) {
    this.vspanSession = paramVMwareVspanSession;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
