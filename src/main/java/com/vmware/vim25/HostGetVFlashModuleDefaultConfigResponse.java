package com.vmware.vim25;

import com.vmware.vim25.HostGetVFlashModuleDefaultConfigResponse;
import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HostGetVFlashModuleDefaultConfigResponse")
public class HostGetVFlashModuleDefaultConfigResponse {
  @XmlElement(required = true)
  protected VirtualDiskVFlashCacheConfigInfo returnval;
  
  public VirtualDiskVFlashCacheConfigInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VirtualDiskVFlashCacheConfigInfo paramVirtualDiskVFlashCacheConfigInfo) {
    this.returnval = paramVirtualDiskVFlashCacheConfigInfo;
  }
}
