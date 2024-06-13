package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDvsLacpCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLacpCapability", propOrder = {"lacpSupported", "multiLacpGroupSupported"})
public class VMwareDvsLacpCapability extends DynamicData {
  protected Boolean lacpSupported;
  
  protected Boolean multiLacpGroupSupported;
  
  public Boolean isLacpSupported() {
    return this.lacpSupported;
  }
  
  public void setLacpSupported(Boolean paramBoolean) {
    this.lacpSupported = paramBoolean;
  }
  
  public Boolean isMultiLacpGroupSupported() {
    return this.multiLacpGroupSupported;
  }
  
  public void setMultiLacpGroupSupported(Boolean paramBoolean) {
    this.multiLacpGroupSupported = paramBoolean;
  }
}
