package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSPvlanConfigSpec;
import com.vmware.vim25.VMwareDVSPvlanMapEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPvlanConfigSpec", propOrder = {"pvlanEntry", "operation"})
public class VMwareDVSPvlanConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected VMwareDVSPvlanMapEntry pvlanEntry;
  
  @XmlElement(required = true)
  protected String operation;
  
  public VMwareDVSPvlanMapEntry getPvlanEntry() {
    return this.pvlanEntry;
  }
  
  public void setPvlanEntry(VMwareDVSPvlanMapEntry paramVMwareDVSPvlanMapEntry) {
    this.pvlanEntry = paramVMwareDVSPvlanMapEntry;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
