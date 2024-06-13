package com.vmware.vim25;

import com.vmware.vim25.VirtualCdromRemotePassthroughBackingInfo;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromRemotePassthroughBackingInfo", propOrder = {"exclusive"})
public class VirtualCdromRemotePassthroughBackingInfo extends VirtualDeviceRemoteDeviceBackingInfo {
  protected boolean exclusive;
  
  public boolean isExclusive() {
    return this.exclusive;
  }
  
  public void setExclusive(boolean paramBoolean) {
    this.exclusive = paramBoolean;
  }
}
