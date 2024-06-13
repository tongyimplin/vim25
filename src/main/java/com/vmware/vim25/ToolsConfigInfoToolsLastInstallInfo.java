package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ToolsConfigInfoToolsLastInstallInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolsConfigInfoToolsLastInstallInfo", propOrder = {"counter", "fault"})
public class ToolsConfigInfoToolsLastInstallInfo extends DynamicData {
  protected int counter;
  
  protected LocalizedMethodFault fault;
  
  public int getCounter() {
    return this.counter;
  }
  
  public void setCounter(int paramInt) {
    this.counter = paramInt;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
