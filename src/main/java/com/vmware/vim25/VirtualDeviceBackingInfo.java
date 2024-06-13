package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDevicePipeBackingInfo;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceURIBackingInfo;
import com.vmware.vim25.VirtualEthernetCardDistributedVirtualPortBackingInfo;
import com.vmware.vim25.VirtualEthernetCardOpaqueNetworkBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughPluginBackingInfo;
import com.vmware.vim25.VirtualPrecisionClockSystemClockBackingInfo;
import com.vmware.vim25.VirtualSerialPortThinPrintBackingInfo;
import com.vmware.vim25.VirtualSriovEthernetCardSriovBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceBackingInfo")
@XmlSeeAlso({VirtualPrecisionClockSystemClockBackingInfo.class, VirtualEthernetCardDistributedVirtualPortBackingInfo.class, VirtualDevicePipeBackingInfo.class, VirtualDeviceURIBackingInfo.class, VirtualPCIPassthroughPluginBackingInfo.class, VirtualSriovEthernetCardSriovBackingInfo.class, VirtualEthernetCardOpaqueNetworkBackingInfo.class, VirtualDeviceRemoteDeviceBackingInfo.class, VirtualDeviceDeviceBackingInfo.class, VirtualDeviceFileBackingInfo.class, VirtualSerialPortThinPrintBackingInfo.class})
public class VirtualDeviceBackingInfo extends DynamicData {}
