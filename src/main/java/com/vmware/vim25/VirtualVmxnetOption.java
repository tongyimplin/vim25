package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCardOption;
import com.vmware.vim25.VirtualVmxnet2Option;
import com.vmware.vim25.VirtualVmxnet3Option;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnetOption")
@XmlSeeAlso({VirtualVmxnet2Option.class, VirtualVmxnet3Option.class})
public class VirtualVmxnetOption extends VirtualEthernetCardOption {}
