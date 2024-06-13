package com.vmware.vim25;

import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.VmwareDistributedVirtualSwitchPvlanSpec;
import com.vmware.vim25.VmwareDistributedVirtualSwitchTrunkVlanSpec;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanIdSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchVlanSpec")
@XmlSeeAlso({VmwareDistributedVirtualSwitchPvlanSpec.class, VmwareDistributedVirtualSwitchVlanIdSpec.class, VmwareDistributedVirtualSwitchTrunkVlanSpec.class})
public class VmwareDistributedVirtualSwitchVlanSpec extends InheritablePolicy {}
