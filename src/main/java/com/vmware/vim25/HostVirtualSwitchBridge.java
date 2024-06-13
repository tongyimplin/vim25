package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualSwitchAutoBridge;
import com.vmware.vim25.HostVirtualSwitchBondBridge;
import com.vmware.vim25.HostVirtualSwitchSimpleBridge;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchBridge")
@XmlSeeAlso({HostVirtualSwitchSimpleBridge.class, HostVirtualSwitchAutoBridge.class, HostVirtualSwitchBondBridge.class})
public class HostVirtualSwitchBridge extends DynamicData {}
