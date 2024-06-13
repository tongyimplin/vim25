package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDefaultProfileSpec;
import com.vmware.vim25.VirtualMachineDefinedProfileSpec;
import com.vmware.vim25.VirtualMachineEmptyProfileSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineProfileSpec")
@XmlSeeAlso({VirtualMachineDefinedProfileSpec.class, VirtualMachineEmptyProfileSpec.class, VirtualMachineDefaultProfileSpec.class})
public class VirtualMachineProfileSpec extends DynamicData {}
