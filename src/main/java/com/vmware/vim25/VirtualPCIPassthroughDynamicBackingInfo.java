package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughAllowedDevice;
import com.vmware.vim25.VirtualPCIPassthroughDynamicBackingInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughDynamicBackingInfo", propOrder = {"allowedDevice", "customLabel", "assignedId"})
public class VirtualPCIPassthroughDynamicBackingInfo extends VirtualDeviceDeviceBackingInfo {
  protected List<VirtualPCIPassthroughAllowedDevice> allowedDevice;
  
  protected String customLabel;
  
  protected String assignedId;
  
  public List<VirtualPCIPassthroughAllowedDevice> getAllowedDevice() {
    if (this.allowedDevice == null)
      this.allowedDevice = new ArrayList<>(); 
    return this.allowedDevice;
  }
  
  public String getCustomLabel() {
    return this.customLabel;
  }
  
  public void setCustomLabel(String paramString) {
    this.customLabel = paramString;
  }
  
  public String getAssignedId() {
    return this.assignedId;
  }
  
  public void setAssignedId(String paramString) {
    this.assignedId = paramString;
  }
}
