package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualCdromRemotePassthroughBackingOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingOption;
import com.vmware.vim25.VirtualFloppyRemoteDeviceBackingOption;
import com.vmware.vim25.VirtualUSBRemoteClientBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceRemoteDeviceBackingOption", propOrder = {"autoDetectAvailable"})
@XmlSeeAlso({VirtualCdromRemotePassthroughBackingOption.class, VirtualFloppyRemoteDeviceBackingOption.class, VirtualUSBRemoteClientBackingOption.class})
public class VirtualDeviceRemoteDeviceBackingOption extends VirtualDeviceBackingOption {
  @XmlElement(required = true)
  protected BoolOption autoDetectAvailable;
  
  public BoolOption getAutoDetectAvailable() {
    return this.autoDetectAvailable;
  }
  
  public void setAutoDetectAvailable(BoolOption paramBoolOption) {
    this.autoDetectAvailable = paramBoolOption;
  }
}
