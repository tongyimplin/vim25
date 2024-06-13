package com.vmware.vim25;

import com.vmware.vim25.NoPeerHostFound;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmotionInterfaceNotEnabled;
import com.vmware.vim25.WakeOnLanNotSupportedByVmotionNIC;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPowerOpFailed")
@XmlSeeAlso({NoPeerHostFound.class, VmotionInterfaceNotEnabled.class, WakeOnLanNotSupportedByVmotionNIC.class})
public class HostPowerOpFailed extends VimFault {}
