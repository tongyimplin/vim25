package com.vmware.vim25;

import com.vmware.vim25.CannotAccessVmConfig;
import com.vmware.vim25.CannotAccessVmDevice;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotAccessVmComponent")
@XmlSeeAlso({CannotAccessVmConfig.class, CannotAccessVmDevice.class})
public class CannotAccessVmComponent extends VmConfigFault {}
