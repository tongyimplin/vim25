package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FcoeConfigFcoeCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfigFcoeCapabilities", propOrder = {"priorityClass", "sourceMacAddress", "vlanRange"})
public class FcoeConfigFcoeCapabilities extends DynamicData {
  protected boolean priorityClass;
  
  protected boolean sourceMacAddress;
  
  protected boolean vlanRange;
  
  public boolean isPriorityClass() {
    return this.priorityClass;
  }
  
  public void setPriorityClass(boolean paramBoolean) {
    this.priorityClass = paramBoolean;
  }
  
  public boolean isSourceMacAddress() {
    return this.sourceMacAddress;
  }
  
  public void setSourceMacAddress(boolean paramBoolean) {
    this.sourceMacAddress = paramBoolean;
  }
  
  public boolean isVlanRange() {
    return this.vlanRange;
  }
  
  public void setVlanRange(boolean paramBoolean) {
    this.vlanRange = paramBoolean;
  }
}
