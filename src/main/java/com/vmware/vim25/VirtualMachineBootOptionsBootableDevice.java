package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineBootOptionsBootableCdromDevice;
import com.vmware.vim25.VirtualMachineBootOptionsBootableDiskDevice;
import com.vmware.vim25.VirtualMachineBootOptionsBootableEthernetDevice;
import com.vmware.vim25.VirtualMachineBootOptionsBootableFloppyDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineBootOptionsBootableDevice")
@XmlSeeAlso({VirtualMachineBootOptionsBootableFloppyDevice.class, VirtualMachineBootOptionsBootableCdromDevice.class, VirtualMachineBootOptionsBootableDiskDevice.class, VirtualMachineBootOptionsBootableEthernetDevice.class})
public class VirtualMachineBootOptionsBootableDevice extends DynamicData {}
