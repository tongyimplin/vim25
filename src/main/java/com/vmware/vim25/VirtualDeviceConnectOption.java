package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDeviceConnectOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConnectOption", propOrder = {"startConnected", "allowGuestControl"})
public class VirtualDeviceConnectOption extends DynamicData {
  @XmlElement(required = true)
  protected BoolOption startConnected;
  
  @XmlElement(required = true)
  protected BoolOption allowGuestControl;
  
  public BoolOption getStartConnected() {
    return this.startConnected;
  }
  
  public void setStartConnected(BoolOption paramBoolOption) {
    this.startConnected = paramBoolOption;
  }
  
  public BoolOption getAllowGuestControl() {
    return this.allowGuestControl;
  }
  
  public void setAllowGuestControl(BoolOption paramBoolOption) {
    this.allowGuestControl = paramBoolOption;
  }
}
