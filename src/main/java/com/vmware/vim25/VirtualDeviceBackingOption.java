package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceFileBackingOption;
import com.vmware.vim25.VirtualDevicePipeBackingOption;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceURIBackingOption;
import com.vmware.vim25.VirtualEthernetCardDVPortBackingOption;
import com.vmware.vim25.VirtualEthernetCardOpaqueNetworkBackingOption;
import com.vmware.vim25.VirtualPCIPassthroughPluginBackingOption;
import com.vmware.vim25.VirtualPrecisionClockSystemClockBackingOption;
import com.vmware.vim25.VirtualSerialPortThinPrintBackingOption;
import com.vmware.vim25.VirtualSriovEthernetCardSriovBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceBackingOption", propOrder = {"type"})
@XmlSeeAlso({VirtualEthernetCardDVPortBackingOption.class, VirtualSerialPortThinPrintBackingOption.class, VirtualDeviceURIBackingOption.class, VirtualSriovEthernetCardSriovBackingOption.class, VirtualEthernetCardOpaqueNetworkBackingOption.class, VirtualDevicePipeBackingOption.class, VirtualPrecisionClockSystemClockBackingOption.class, VirtualDeviceRemoteDeviceBackingOption.class, VirtualDeviceDeviceBackingOption.class, VirtualDeviceFileBackingOption.class, VirtualPCIPassthroughPluginBackingOption.class})
public class VirtualDeviceBackingOption extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
