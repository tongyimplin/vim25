package com.vmware.vim25;

import com.vmware.vim25.HostPciPassthruInfo;
import com.vmware.vim25.HostSriovInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSriovInfo", propOrder = {"sriovEnabled", "sriovCapable", "sriovActive", "numVirtualFunctionRequested", "numVirtualFunction", "maxVirtualFunctionSupported"})
public class HostSriovInfo extends HostPciPassthruInfo {
  protected boolean sriovEnabled;
  
  protected boolean sriovCapable;
  
  protected boolean sriovActive;
  
  protected int numVirtualFunctionRequested;
  
  protected int numVirtualFunction;
  
  protected int maxVirtualFunctionSupported;
  
  public boolean isSriovEnabled() {
    return this.sriovEnabled;
  }
  
  public void setSriovEnabled(boolean paramBoolean) {
    this.sriovEnabled = paramBoolean;
  }
  
  public boolean isSriovCapable() {
    return this.sriovCapable;
  }
  
  public void setSriovCapable(boolean paramBoolean) {
    this.sriovCapable = paramBoolean;
  }
  
  public boolean isSriovActive() {
    return this.sriovActive;
  }
  
  public void setSriovActive(boolean paramBoolean) {
    this.sriovActive = paramBoolean;
  }
  
  public int getNumVirtualFunctionRequested() {
    return this.numVirtualFunctionRequested;
  }
  
  public void setNumVirtualFunctionRequested(int paramInt) {
    this.numVirtualFunctionRequested = paramInt;
  }
  
  public int getNumVirtualFunction() {
    return this.numVirtualFunction;
  }
  
  public void setNumVirtualFunction(int paramInt) {
    this.numVirtualFunction = paramInt;
  }
  
  public int getMaxVirtualFunctionSupported() {
    return this.maxVirtualFunctionSupported;
  }
  
  public void setMaxVirtualFunctionSupported(int paramInt) {
    this.maxVirtualFunctionSupported = paramInt;
  }
}
