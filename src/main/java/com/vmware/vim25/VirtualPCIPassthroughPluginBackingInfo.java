package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughVmiopBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughPluginBackingInfo")
@XmlSeeAlso({VirtualPCIPassthroughVmiopBackingInfo.class})
public class VirtualPCIPassthroughPluginBackingInfo extends VirtualDeviceBackingInfo {}
