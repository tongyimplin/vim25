package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualPCIPassthroughVmiopBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughPluginBackingOption")
@XmlSeeAlso({VirtualPCIPassthroughVmiopBackingOption.class})
public class VirtualPCIPassthroughPluginBackingOption extends VirtualDeviceBackingOption {}
