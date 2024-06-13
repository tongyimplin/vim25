package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDvsLacpGroupConfig;
import com.vmware.vim25.VMwareDvsLacpGroupSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLacpGroupSpec", propOrder = {"lacpGroupConfig", "operation"})
public class VMwareDvsLacpGroupSpec extends DynamicData {
  @XmlElement(required = true)
  protected VMwareDvsLacpGroupConfig lacpGroupConfig;
  
  @XmlElement(required = true)
  protected String operation;
  
  public VMwareDvsLacpGroupConfig getLacpGroupConfig() {
    return this.lacpGroupConfig;
  }
  
  public void setLacpGroupConfig(VMwareDvsLacpGroupConfig paramVMwareDvsLacpGroupConfig) {
    this.lacpGroupConfig = paramVMwareDvsLacpGroupConfig;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
