package com.vmware.vim25;

import com.vmware.vim25.VirtualCdromPassthroughBackingInfo;
import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromPassthroughBackingInfo", propOrder = {"exclusive"})
public class VirtualCdromPassthroughBackingInfo extends VirtualDeviceDeviceBackingInfo {
  protected boolean exclusive;
  
  public boolean isExclusive() {
    return this.exclusive;
  }
  
  public void setExclusive(boolean paramBoolean) {
    this.exclusive = paramBoolean;
  }
}
