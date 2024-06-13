package com.vmware.vim25;

import com.vmware.vim25.HostPciPassthruConfig;
import com.vmware.vim25.HostSriovConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSriovConfig", propOrder = {"sriovEnabled", "numVirtualFunction"})
public class HostSriovConfig extends HostPciPassthruConfig {
  protected boolean sriovEnabled;
  
  protected int numVirtualFunction;
  
  public boolean isSriovEnabled() {
    return this.sriovEnabled;
  }
  
  public void setSriovEnabled(boolean paramBoolean) {
    this.sriovEnabled = paramBoolean;
  }
  
  public int getNumVirtualFunction() {
    return this.numVirtualFunction;
  }
  
  public void setNumVirtualFunction(int paramInt) {
    this.numVirtualFunction = paramInt;
  }
}
